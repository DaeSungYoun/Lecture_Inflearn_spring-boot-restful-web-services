package com.example.restfulwebservice.controller;

import com.example.restfulwebservice.domain.User;
import com.example.restfulwebservice.service.UserDaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return userDaoService.findOne(id);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userDaoService.save(user);
    }
}
