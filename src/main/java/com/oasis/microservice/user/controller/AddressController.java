package com.oasis.microservice.user.controller;

import com.oasis.microservice.user.domain.Address;
import com.oasis.microservice.user.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/api/address")
@RequiredArgsConstructor

public class AddressController {
    @Autowired
    private AddressRepository addressRepository;

    @GetMapping
    public List<Address> findAll(Pageable pageable) {
        return addressRepository.findAll();
    }
}
