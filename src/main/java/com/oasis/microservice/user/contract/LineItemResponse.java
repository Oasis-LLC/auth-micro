package com.oasis.microservice.user.contract;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class LineItemResponse {
    private String id;
    private int quantity;
    private double discount;
    private ItemResponse item;
}
