package com.oasis.microservice.user.contract;

import lombok.Data;

@Data
public class ReviewResponse {
    private String id;
    private int numberOfStars;
    private String title;
    private String date;
    private String description;
    private UserResponse buyer;
}
