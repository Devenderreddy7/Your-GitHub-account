package com.example.customerwelcomeapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(@RequestParam(required = false) String name) {

        if (name == null || name.isBlank()) {
            name = "Guest";
        }

        return "Welcome, " + name.trim() +
               "! Thank you for visiting our application.";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
