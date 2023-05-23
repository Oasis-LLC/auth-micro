package com.oasis.onlinestore.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
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

