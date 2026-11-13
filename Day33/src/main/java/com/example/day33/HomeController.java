package com.example.day33;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {

        return "Welcome to Spring Boot Application!";
    }

    @GetMapping("/about")
    public String about() {

        return "This is Day 33 Spring Boot Practical.";
    }
}