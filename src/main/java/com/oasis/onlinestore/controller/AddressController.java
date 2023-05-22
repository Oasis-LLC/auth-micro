package com.oasis.onlinestore.controller;


import com.oasis.onlinestore.domain.Address;
import com.oasis.onlinestore.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
@RequiredArgsConstructor

public class AddressController {

    private final AddressService productService;



}
