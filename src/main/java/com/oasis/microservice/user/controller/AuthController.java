package com.oasis.microservice.user.controller;

import com.oasis.microservice.user.contract.UserResponse;
import com.oasis.microservice.user.domain.User;
import com.oasis.microservice.user.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/signup")
    public ResponseEntity<?> register(@RequestBody User user) {
        if (userAlreadyExists(user.getEmail())) {
            return ResponseEntity.badRequest().body("User already exists");
        }

        User newUser = userService.save(user);
        UserResponse userResponse = modelMapper.map(newUser, UserResponse.class);

        return new ResponseEntity<UserResponse>(userResponse, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        if (!userAlreadyExists(user.getEmail())) {
            return ResponseEntity.badRequest().body("User does not exist");
        }

        User existingUser = userService.findByEmail(user.getEmail());
        UserResponse userResponse = modelMapper.map(existingUser, UserResponse.class);

        return new ResponseEntity<UserResponse>(userResponse, HttpStatus.OK);
    }

    private boolean userAlreadyExists(String email) {
        return userService.existsByEmail(email);
    }
}
