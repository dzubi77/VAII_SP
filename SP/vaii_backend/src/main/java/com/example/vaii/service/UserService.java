package com.example.vaii.service;

import com.example.vaii.controller.LoginRequest;
import com.example.vaii.dataAccess.UserRepository;
import com.example.vaii.exceptions.UsernameTakenException;
import com.example.vaii.model.User1;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public List<User1> getAllUsers() {
        return this.userRepository.findAll();
    }

    public ResponseEntity<String> createUser(User1 user) {
        // TODO: hash password
        Optional<User1> userByUN = this.userRepository.findUserByUsername(user.getUsername());
        if (userByUN.isPresent()) {
            throw new UsernameTakenException("Username taken!");
        } else {
            this.userRepository.save(user);
            return ResponseEntity.ok("User created successfully!");
        }
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

    public ResponseEntity<String> loginUser(LoginRequest loginRequest) {
        if (this.authenticateUser(loginRequest.getUsername(), loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed!");
        }
    }
}
