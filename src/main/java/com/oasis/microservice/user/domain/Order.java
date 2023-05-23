package com.oasis.microservice.user.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity(name = "Purchase")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "customer_id")
    private User user;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "addressId")
    private Address shippingAddress;

    @Transient
    private List<LineItem> lineItems;
    @Enumerated
    private Status status;

    public boolean isEditable() {
        return status == Status.PLACED;
    }
}