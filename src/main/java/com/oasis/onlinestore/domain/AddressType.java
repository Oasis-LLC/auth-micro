package com.oasis.onlinestore.domain;

<<<<<<< Updated upstream
public class AddressType {
=======
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
>>>>>>> Stashed changes
    private int id;
    private String type;
}
