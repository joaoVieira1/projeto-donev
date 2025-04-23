package com.application.donev.project.controllers;

import com.application.donev.project.dtos.UserDTO;
import com.application.donev.project.models.User;
import com.application.donev.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody UserDTO userDTO){
        User newUser = this.userService.registerUser(userDTO);

        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

}
