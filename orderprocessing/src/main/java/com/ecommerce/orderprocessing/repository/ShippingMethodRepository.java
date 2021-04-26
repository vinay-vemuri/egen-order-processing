package com.ecommerce.orderprocessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.orderprocessing.tables.Payment;
import com.ecommerce.orderprocessing.tables.ShippingMethod;

@Repository
public interface ShippingMethodRepository  extends JpaRepository<ShippingMethod, String>{

}
