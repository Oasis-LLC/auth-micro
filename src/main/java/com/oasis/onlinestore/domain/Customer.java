package com.oasis.onlinestore.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

import java.util.List;

public class Customer {
    private String Id;
    private String firstName;
    private String lastName;
    private String email;
    private Address billingAddress;
    private List<Address> shippingAddresses;
    private List<CreditCard> creditCards;
    @Transient
    private List<Order> orders;
}
