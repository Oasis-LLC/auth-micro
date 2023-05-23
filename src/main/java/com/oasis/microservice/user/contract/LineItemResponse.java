package com.oasis.microservice.user.contract;

import lombok.Data;

@Data
public class LineItemResponse {
    private String id;
    private int quantity;
    private double discount;
    private ItemResponse item;
}
