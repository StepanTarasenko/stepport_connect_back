package com.example.stepport.connect.controller;

import com.example.stepport.connect.dto.UserDto;
import com.example.stepport.connect.model.User;
import com.example.stepport.connect.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/user")
    public List<User> showUsers() {
        return service.findUsers();
    }

    @GetMapping("/user/{id}")
    public User showUser(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/user/old")
    public List<User> showOldUsers() {
        return service.findOldUsers();
    }

    @PostMapping("/user")
    public User createUser(@RequestBody UserDto user) {
        return service.save(user);
    }
}
