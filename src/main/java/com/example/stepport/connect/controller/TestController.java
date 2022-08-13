package com.example.stepport.connect.controller;

import com.example.stepport.connect.dto.UserDto;
import com.example.stepport.connect.model.User;
import com.example.stepport.connect.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    private final UserService service;

    public TestController(UserService service) {
        this.service = service;
    }

    @GetMapping("/init")
    public String getInit() {
        return "Hello, world 1";
    }

    @GetMapping("/showUsers")
    public List<User> showUsers() {
        return service.findUsers();
    }

    @PostMapping("/createUser")
    public User createUser(UserDto user) {
        return service.save(user);
    }
}
