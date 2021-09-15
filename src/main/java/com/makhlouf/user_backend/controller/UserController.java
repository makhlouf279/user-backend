package com.makhlouf.user_backend.controller;


import com.makhlouf.user_backend.model.User;
import com.makhlouf.user_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private  UserRepository userRepository ;
    @GetMapping("")
    public List<User> getUsers(){
        return userRepository.findAll();

    }
}
