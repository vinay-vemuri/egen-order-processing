package com.ecommerce.orderprocessing.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.orderprocessing.request.RequestOrder;
import com.ecommerce.orderprocessing.response.ResponseOrder;
import com.ecommerce.orderprocessing.service.CancelOrderService;
import com.ecommerce.orderprocessing.service.CreateOrderService;

@RestController
public class CancelOrderController {
	
	@Autowired
	public CancelOrderService cancelOrderService;
	
	Logger log = LogManager.getLogger(CancelOrderController.class);
	
	@RequestMapping(value = "/cancelOrder", method = RequestMethod.POST)
	public @ResponseBody ResponseOrder cancelOrder(@RequestBody RequestOrder apiRequest) {
	
		ResponseOrder response = cancelOrderService.cancelOrder(apiRequest);
		
		return response;
	}


}
