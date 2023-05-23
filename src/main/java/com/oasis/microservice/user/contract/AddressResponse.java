package com.oasis.microservice.user.contract;

import com.oasis.microservice.user.domain.AddressType;
import lombok.Data;

@Data
public class AddressResponse {
    private Integer id;
    private AddressType addressType;
    private String line1;
    private String line2;
    private String city;
    private String street;
    private String zip;
    private String state;
}
