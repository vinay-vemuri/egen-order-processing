package com.ecommerce.orderprocessing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.orderprocessing.models.OrderDetails;
import com.ecommerce.orderprocessing.service.OrderprocessingService;

@RestController
public class OrdersController {
	
	@Autowired
	public OrderprocessingService orderprocessingService;
	
	@RequestMapping(value="/getOrderById/{id}",method=RequestMethod.GET, produces="application/json")
	public @ResponseBody OrderDetails getOrderById(@PathVariable("id") String id) {
		
		return orderprocessingService.getOrderDetailsById(id);
		
	}
	
	
}
