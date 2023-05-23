package com.oasis.microservice.user.contract;

import lombok.Data;

@Data
public class CreditCardResponse {
    private String id;
    private String cardHolderName;
    private String cardNumber;
}
