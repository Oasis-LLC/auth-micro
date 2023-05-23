package com.oasis.microservice.user.controller;

import com.oasis.microservice.user.contract.UserResponse;
import com.oasis.microservice.user.domain.User;
import com.oasis.microservice.user.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
        // TODO: Check if user already exists by email
        if (userAlreadyExists(user.getEmail())) {
            return ResponseEntity.badRequest().body("User already exists");
        }

        // TODO: Save user to database and return user response
        User newUser = userService.save(user);
        UserResponse userResponse = modelMapper.map(newUser, UserResponse.class);

        return ResponseEntity.ok(userResponse);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        if (!userAlreadyExists(user.getEmail())) {
            return ResponseEntity.badRequest().body("User does not exist");
        }

        User existingUser = userService.findByEmail(user.getEmail());
        UserResponse userResponse = modelMapper.map(existingUser, UserResponse.class);

        return ResponseEntity.ok(userResponse);
    }

    private boolean userAlreadyExists(String email) {
        return userService.findByEmail(email) != null;
    }
}
