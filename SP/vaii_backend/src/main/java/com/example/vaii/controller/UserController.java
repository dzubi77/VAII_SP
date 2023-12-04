package com.example.vaii.controller;

import com.example.vaii.model.User1;
import com.example.vaii.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/user")
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
}
