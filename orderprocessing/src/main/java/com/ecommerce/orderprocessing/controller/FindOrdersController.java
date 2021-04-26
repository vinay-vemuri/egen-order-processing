package com.ecommerce.orderprocessing.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.orderprocessing.models.OrderDetails;
import com.ecommerce.orderprocessing.request.RequestOrder;
import com.ecommerce.orderprocessing.service.FindOrdersService;

@RestController
public class FindOrdersController {
	
	@Autowired
	public FindOrdersService findOrdersService;
	
	Logger log = LogManager.getLogger(FindOrdersController.class);
	
	@RequestMapping(value="/getOrderById/{id}",method=RequestMethod.GET, produces="application/json")
	public @ResponseBody RequestOrder getOrderById(@PathVariable("id") String id) {
		
		RequestOrder ro = findOrdersService.getOrderDetailsById(id);
		
		return ro;
		
	}
	
	
}
