package com.oasis.microservice.user.domain;

import com.oasis.microservice.user.contract.OrderResponse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    @Column(name = "UserID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(unique = true, name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "BillingAddressID")
    private Address billingAddress;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "UserShippingAddresses",
            joinColumns = @JoinColumn(name = "UserID"),
            inverseJoinColumns = @JoinColumn(name = "AddressID")
    )
    private List<Address> shippingAddresses;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<CreditCard> creditCards;
    @Transient
    private List<OrderResponse> orders;
}
