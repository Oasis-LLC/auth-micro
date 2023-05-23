package com.oasis.microservice.user.service;


import com.oasis.microservice.user.domain.Address;
import com.oasis.microservice.user.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Page<Address> findAll(Pageable pageable) {
        return addressRepository.findAll(pageable);
    }

    public Address findById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    public Address save(Address user) {
        return addressRepository.save(user);
    }

    public void deleteById(Long id) {
        addressRepository.deleteById(id);
    }
}
