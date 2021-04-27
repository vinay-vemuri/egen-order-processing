
package com.ecommerce.orderprocessing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import com.ecommerce.orderprocessing.controller.FindOrdersController;
import com.ecommerce.orderprocessing.request.RequestOrder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ecommerce.orderprocessing.response.ResponseOrder;
import com.ecommerce.orderprocessing.service.CancelOrderService;
import com.ecommerce.orderprocessing.service.CreateOrderService;
import com.ecommerce.orderprocessing.service.FindOrdersService;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderprocessingApplicationTests {
	@Autowired
	private CreateOrderService createOrderService;
	@Autowired
	private CancelOrderService cancelOrderService;
	@Autowired
	private FindOrdersService findOrderService;
	Logger log = LogManager.getLogger(FindOrdersController.class);
	
	@Test
	public void contextLoads() {
		
	}

	@Test
	public void testCaseTest() {
		assertEquals(1, 1);
	}
	
	@Test
	public void testCreateOrder() {
		log.info("Create Order testcase start >");
		RequestOrder reqorder = new RequestOrder("Test");
		ResponseOrder response = createOrderService.createOrder(reqorder);
		assertNotNull(response.getOrderId());
		log.info("Create Order testcase end >");
	}
	
	@Test
	public void testCancelOrder() {
		log.info("Cancel Order testcase start >");
		RequestOrder reqorder = new RequestOrder("Test");
		ResponseOrder response1 = createOrderService.createOrder(reqorder);
		String orderId = response1.getOrderId();
		reqorder.setOrder_id(orderId);
		ResponseOrder response2 = cancelOrderService.cancelOrder(reqorder);
		assertEquals(orderId, response2.getOrderId());
		log.info("Cancel Order testcase end >");
	}

	
	@Test
	public void testFindOrders() {
		log.info("Find Order testcase start >");
		RequestOrder reqorder = new RequestOrder();
		ResponseOrder response1 = createOrderService.createOrder(reqorder);
		String orderId = response1.getOrderId();
		reqorder = findOrderService.getOrderDetailsById(orderId);
		assertEquals(orderId, reqorder.getOrder_id());
		log.info("Find Order testcase end >");
	}
	 
}
