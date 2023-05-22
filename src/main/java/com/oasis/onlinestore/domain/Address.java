package com.oasis.onlinestore.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    @Column

    private String city;
    @Column
    private String street;
    @Column
    private String zip;

    private String state;


    @Column
    private String statgite;





}
