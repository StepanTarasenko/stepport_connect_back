package com.example.stepport.connect.service;

import com.example.stepport.connect.dto.UserDto;
import com.example.stepport.connect.model.User;
import com.example.stepport.connect.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(UserDto userDto) {
        User user = new User(userDto.getName());
        return repository.save(user);
    }

    public List<User> findUsers() {
        return repository.findAll();
    }
}
