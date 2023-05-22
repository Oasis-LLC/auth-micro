package com.oasis.onlinestore.domain;

<<<<<<< Updated upstream
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Address {
    @Id
    @GeneratedValue
    private String id;
=======
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
@Builder
public class Address {

    @Id
    private Long id;

    @ManyToOne
    private Customer customer;

    @Column
>>>>>>> Stashed changes
    private String city;
    @Column
    private String street;
    @Column
    private String zip;
<<<<<<< Updated upstream
    private String state;
    private AddressType addressType;
=======
    @Column
    private String statgite;
    @Embedded

    private AddressType addressType;



>>>>>>> Stashed changes
}
