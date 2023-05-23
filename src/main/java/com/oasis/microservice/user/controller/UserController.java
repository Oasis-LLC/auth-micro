package com.oasis.microservice.user.controller;

import com.oasis.microservice.user.contract.UserResponse;
import com.oasis.microservice.user.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper mapper;

    public Page<UserResponse> findAll(Pageable pageable) {
        return userService.findAll(pageable).map(user -> mapper.map(user, UserResponse.class));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        UserResponse user = mapper.map(userService.findById(id), UserResponse.class);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody UserResponse user) {
        // TODO: Implement this method
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        // TODO: Implement this method
        return null;
    }
}
