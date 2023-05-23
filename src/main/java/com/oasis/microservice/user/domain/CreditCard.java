package com.oasis.microservice.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class CreditCard {
    @Id
    @Column(name = "CreditCardID")
    private String id;
    @Column(name = "CardHolderName")
    private String cardHolderName;
    @Column(name = "CardNumber")
    private String cardNumber;
    @Column(name = "ExpiryDate")
    private Date expiryDate;
    @Column(name = "CVV")
    private String cvv;
}


