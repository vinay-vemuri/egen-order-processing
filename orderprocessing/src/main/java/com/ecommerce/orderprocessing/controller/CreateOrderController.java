package com.ecommerce.orderprocessing.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.orderprocessing.models.OrderDetails;
import com.ecommerce.orderprocessing.request.RequestOrder;
import com.ecommerce.orderprocessing.response.ResponseOrder;
import com.ecommerce.orderprocessing.service.CreateOrderService;
import com.ecommerce.orderprocessing.service.FindOrdersService;

@RestController
public class CreateOrderController {
	@Autowired
	public CreateOrderService createOrderService;
	
	Logger log = LogManager.getLogger(FindOrdersController.class);
	
	@RequestMapping(value = "/createOrder", method = RequestMethod.POST)
	@ResponseBody
	public ResponseOrder createOrder(@RequestBody RequestOrder apiRequest) {
	
		
		ResponseOrder response = createOrderService.createOrder(apiRequest);
		
		return response;
	}

}
