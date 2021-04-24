package com.ecommerce.orderprocessing.service;

import org.springframework.stereotype.Service;

import com.ecommerce.orderprocessing.models.OrderDetails;

@Service
public class OrderprocessingService {
	
	public OrderDetails getOrderDetailsById(String id) {
		//db part is pending
		OrderDetails od = new OrderDetails();
		od.setOrderId(id);
		od.setOrderName("Temp Order Name");
		od.setOrderStatus("Temp Order Status");
		
		return od;
	}
	
}
