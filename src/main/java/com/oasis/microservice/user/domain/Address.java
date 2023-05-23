package com.oasis.microservice.user.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "AddressID")
    private Integer id;
    @Column(name = "AddressType")
    private AddressType addressType;
    @Column(name = "City")
    private String city;
    @Column(name = "Street")
    private String street;
    @Column(name = "ZipCode")
    private String zip;
    @Column(name = "State")
    private String state;
}

