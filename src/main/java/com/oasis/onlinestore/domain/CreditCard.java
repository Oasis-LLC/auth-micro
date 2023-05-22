package com.oasis.onlinestore.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "credit_card")

public class CreditCard {
    @Id
    private String id;
    @Column(name = "card_holder_name")
    private String cardHolderName;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "expiry_date")
    private Date expiryDate;
    @Column(name = "cvv")
    private String cvv;

    public CreditCard() {
    }
    public CreditCard(String id, String cardHolderName, String cardNumber, Date expiryDate, String cvv) {
        this.id = id;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
}
