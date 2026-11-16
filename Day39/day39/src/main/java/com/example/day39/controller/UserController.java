package com.example.day39.controller;

import com.example.day39.dto.RegisterRequest;
import com.example.day39.service.UserService;

import org.springframework.web.bind.annotation.*;
import com.example.day39.dto.AuthResponse;
import com.example.day39.dto.LoginRequest;

@RestController
@RequestMapping("/auth")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {

        return userService.register(request);
    }
    @PostMapping("/login")
public AuthResponse login(@RequestBody LoginRequest request) {
    return userService.login(request);
}
}