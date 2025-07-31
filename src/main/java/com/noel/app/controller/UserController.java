package com.noel.app.controller;

import com.noel.app.model.User;
import com.noel.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add-user")
    public User saveUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @GetMapping("/all-users")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
