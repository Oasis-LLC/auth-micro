package com.oasis.microservice.user.controller;

import com.oasis.microservice.user.contract.AddressResponse;
import com.oasis.microservice.user.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @Autowired
    private ModelMapper mapper;

    @GetMapping("/")
    public Page<AddressResponse> findAll(Pageable pageable) {
        return addressService.findAll(pageable).map(address -> mapper.map(address, AddressResponse.class));
    }

    @GetMapping("/{id}")
    public AddressResponse findById(String id) {
        // TODO: Implement this method body
        return null;
    }
}
