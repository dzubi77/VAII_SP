package com.example.vaii.controller;

import com.example.vaii.model.User1;
import com.example.vaii.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User1> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @PostMapping
    public void createUser(@RequestBody User1 user) {
        this.userService.createUser(user);
    }

    @PostMapping(path = "/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest) {
        if (this.userService.authenticateUser(loginRequest.getUsername(), loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed!");
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<User1> deleteUser(@PathVariable UUID id) {
        this.userService.deleteUserByID(id);
        return ResponseEntity.noContent().build();
    }
}
