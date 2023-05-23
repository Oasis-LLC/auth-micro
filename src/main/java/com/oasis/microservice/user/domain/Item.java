package com.oasis.microservice.user.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String description;

    private String image;

    private String barcode;

    private int quantity;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "itemId")
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "BundleItem", joinColumns = {@JoinColumn(name = "itemId", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "subItemId", referencedColumnName = "id")})
    private List<Item> items = new ArrayList<>(); // composite
}