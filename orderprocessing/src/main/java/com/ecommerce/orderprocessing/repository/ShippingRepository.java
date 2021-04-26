package com.ecommerce.orderprocessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.orderprocessing.tables.Shipping;

@Repository
public interface ShippingRepository  extends JpaRepository<Shipping, String>{

}
