package com.ecommerce.orderprocessing.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.orderprocessing.repository.OrderRepository;
import com.ecommerce.orderprocessing.request.RequestOrder;
import com.ecommerce.orderprocessing.response.ResponseOrder;
import com.ecommerce.orderprocessing.tables.Order;

@Service
public class CancelOrderService {
	
	@Autowired
	public OrderRepository orderRepo;
	
	public ResponseOrder cancelOrder(RequestOrder ro) {
		
		Date d1 = new Date();
		String user= "egen";
		
		Order order = new Order();
		order.setCustomer_id(ro.getCustomer_id());
		order.setInserted_By(user);
		order.setOrder_id(ro.getOrder_id());
		order.setStatus("CANCELLED");
		order.setUpdate_TS(d1.toString());
		order.setUpdated_By(user);
	
		orderRepo.save(order);
		
		ResponseOrder responseOrder = new ResponseOrder();
		responseOrder.setMessage("Order Successfully Cancelled");
		responseOrder.setOrderId(ro.getOrder_id());
		responseOrder.setCustomer_id(ro.getCustomer_id());
		
		return responseOrder;
	}
}
