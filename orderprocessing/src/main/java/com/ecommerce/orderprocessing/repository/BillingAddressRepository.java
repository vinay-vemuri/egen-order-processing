package com.ecommerce.orderprocessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.orderprocessing.tables.BillingAddress;
import com.ecommerce.orderprocessing.tables.OrderTotal;

@Repository
public interface BillingAddressRepository extends JpaRepository<BillingAddress, String> {

}
