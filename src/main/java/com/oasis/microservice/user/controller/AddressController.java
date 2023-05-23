package com.oasis.microservice.user.controller;


import com.oasis.microservice.user.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
@RequiredArgsConstructor

public class AddressController {
    private final AddressService productService;
}