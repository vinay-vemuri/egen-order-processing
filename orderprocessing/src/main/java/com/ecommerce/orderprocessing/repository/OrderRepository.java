package com.ecommerce.orderprocessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.orderprocessing.tables.Order;
import com.ecommerce.orderprocessing.tables.OrderTotal;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
	
}
