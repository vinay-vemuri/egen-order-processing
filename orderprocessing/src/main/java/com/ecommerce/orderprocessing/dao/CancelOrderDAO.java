package com.ecommerce.orderprocessing.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.orderprocessing.repository.OrderRepository;


public class CancelOrderDAO {
	
	@Autowired
	public OrderRepository orderRepo;
	
	
}
