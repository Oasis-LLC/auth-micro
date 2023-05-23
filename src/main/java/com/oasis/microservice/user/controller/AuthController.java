package com.oasis.microservice.user.controller;

import com.oasis.microservice.user.contract.UserResponse;
import com.oasis.microservice.user.domain.User;
import com.oasis.microservice.user.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/signup")
    public UserResponse register(@RequestBody String userDetails) {
        return null;
    }

    @PostMapping("/login")
    public UserResponse login(@RequestBody String userDetails) {
        return null;
    }
}
