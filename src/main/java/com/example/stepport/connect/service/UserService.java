package com.example.stepport.connect.service;

import com.example.stepport.connect.dto.UserDto;
import com.example.stepport.connect.model.User;
import com.example.stepport.connect.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(UserDto userDto) {
        User user = new User(userDto.getName(), userDto.getAge());
        return repository.save(user);
    }

    public List<User> findUsers() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("User with %d not found", id)));
    }

    public List<User> findOldUsers() {
        return repository.findAllByAgeGreaterThanEqual(18);
    }
}
