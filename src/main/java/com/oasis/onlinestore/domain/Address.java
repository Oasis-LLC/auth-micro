package com.oasis.onlinestore.domain;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;


public class Address {

    private String city;
    private String street;
    private String zip;
    private String state;

    private AddressType addressType;
    private Long id;


}
