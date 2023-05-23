package com.oasis.microservice.user.contract;

import com.oasis.microservice.user.domain.Address;
import com.oasis.microservice.user.domain.User;
import lombok.Data;

import java.util.List;

@Data
public class OrderResponse {
    private String id;
    private User user;
    private Address shippingAddress;
    private List<LineItemResponse> lineItems;
    private StatusResponse status;
}
