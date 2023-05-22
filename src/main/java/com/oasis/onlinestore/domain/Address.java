package com.oasis.onlinestore.domain;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Address {
@Id
    private String city;
    private String street;
    private String zip;
    private String state;

    private AddressType addressType;
    private Long id;


}
