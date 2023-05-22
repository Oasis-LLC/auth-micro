package com.oasis.onlinestore.domain;



import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data

public class AddressType {

    @Id

    private int id;
    private String type;
}
