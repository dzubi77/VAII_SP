package com.example.vaii.service;

import com.example.vaii.dataAccess.UserRepository;
import com.example.vaii.exceptions.UsernameTakenException;
import com.example.vaii.model.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
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
}
