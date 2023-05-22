package com.oasis.onlinestore.repository;

import com.oasis.onlinestore.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {

}
