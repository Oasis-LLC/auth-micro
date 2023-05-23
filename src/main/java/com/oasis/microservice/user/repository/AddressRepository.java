package com.oasis.microservice.user.repository;

import com.oasis.microservice.user.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
