package com.ecommerce.orderprocessing.kafka;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.ecommerce.orderprocessing.request.RequestOrder;
import com.ecommerce.orderprocessing.response.ResponseOrder;
import com.ecommerce.orderprocessing.service.CreateOrderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@EnableKafka
@Service
public class KafkaOrdersConsumer {
	
	@Autowired
    CreateOrderService createOrderService;
    
	private static final Logger log = LoggerFactory.getLogger(KafkaOrdersConsumer.class);

	@KafkaListener(topics = "createorders")
    public void consume(String orders) throws IOException {
        log.info("received orders: "+ orders);
        
        ObjectMapper objectMapper = new ObjectMapper();
        List<RequestOrder> ordersObjs = objectMapper.readValue(orders, OrdersList.class).getOrdersList();
        
        // We can use @async annotation also for parallel processing of orders
        // We can also write different service and run it as a seperate microservice instead of using createOrderService to reduce the load on the service
        List<ResponseOrder> responseObjs = ordersObjs.parallelStream().map(order -> createOrderService.createOrder(order)).collect(Collectors.toList());
        
        log.info("Response after creating bulk orders: "+(new Gson()).toJson(responseObjs));
        
    }
}

class OrdersList{
	List<RequestOrder> ordersList;

	public List<RequestOrder> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<RequestOrder> ordersList) {
		this.ordersList = ordersList;
	}
	
}