package com.oasis.microservice.user.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class LineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int quantity;
    private double discount;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "itemId")
    private Item item;

    public LineItem(){

    }



}