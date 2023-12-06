package com.example.vaii.service;

import com.example.vaii.dataAccess.UserRepository;
import com.example.vaii.exceptions.UsernameTakenException;
import com.example.vaii.model.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<User1> getAllUsers() {
        return this.userRepository.findAll();
    }

    public void createUser(User1 user) {
        // TODO: hash password
        Optional<User1> userByUN = this.userRepository.findUserByUsername(user.getUsername());
        if (userByUN.isPresent()) {
            throw new UsernameTakenException("Username taken!");
        }
        this.userRepository.save(user);
    }

    public void deleteUserByID(UUID id) {
        this.userRepository.deleteUser1ByUserID(id);
    }

    public boolean authenticateUser(String username, String password) {
        Optional<User1> userOp = this.userRepository.findUserByUsername(username);
        if (userOp.isPresent()) {
            User1 user = userOp.get();
            return this.passwordEncoder.matches(password, user.getPassword());
        }
        return false;
    }
}
