package com.oasis.onlinestore.domain;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class AddressType {

    @Id
    private int id;
    private String type;
}
