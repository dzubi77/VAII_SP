package com.example.vaii.controller;

import com.example.vaii.model.User1;
import com.example.vaii.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users")
@CrossOrigin(origins = "http://localhost:56622")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User1> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @PostMapping(path = "/signup")
    public ResponseEntity<String> createUser(@RequestBody User1 user) {
        return this.userService.createUser(user);
    }

    @PostMapping(path = "/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest) {
        return this.userService.loginUser(loginRequest);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(UUID id) {
        this.userService.deleteUserByID(id);
    }
}
