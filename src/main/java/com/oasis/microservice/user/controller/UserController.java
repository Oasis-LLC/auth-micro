package com.oasis.microservice.user.controller;

import com.oasis.microservice.user.contract.UserResponse;
import com.oasis.microservice.user.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper mapper;

    @GetMapping("/")
    public Page<UserResponse> findAll(Pageable pageable) {
        return userService.findAll(pageable).map(user -> mapper.map(user, UserResponse.class));
    }

    @GetMapping("/{id}")
    public UserResponse findById(String id) {
        return mapper.map(userService.findById(id), UserResponse.class);
    }
}
