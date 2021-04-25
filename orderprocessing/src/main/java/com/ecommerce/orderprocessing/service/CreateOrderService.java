package com.ecommerce.orderprocessing.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.orderprocessing.models.OrderDetails;
import com.ecommerce.orderprocessing.request.RequestOrder;
import com.ecommerce.orderprocessing.response.ResponseOrder;
import com.ecommerce.orderprocessing.tables.BillingAddress;
import com.ecommerce.orderprocessing.tables.Item;
import com.ecommerce.orderprocessing.tables.Order;
import com.ecommerce.orderprocessing.tables.OrderTotal;
import com.ecommerce.orderprocessing.tables.Payment;
import com.ecommerce.orderprocessing.tables.Shipping;
import com.ecommerce.orderprocessing.tables.ShippingMethod;

@Service
public class CreateOrderService {
	
	public ResponseOrder createOrder(RequestOrder apiRequest) {
		BillingAddress billingAddress = new BillingAddress();
		Item item = new Item();
		Order order = new Order();
		OrderTotal orderTotal = new OrderTotal();
		Payment payment = new Payment();
		Shipping shipping = new Shipping();
		ShippingMethod shippingMethod = new ShippingMethod();
		
		billingAddress.setBilling_Address_id(apiRequest.getBilling_Address_id());
		billingAddress.setAddress_line_1(apiRequest.getAddress_line_1());
		billingAddress.setAddress_line_2(apiRequest.getAddress_line_2());
		billingAddress.setCity(apiRequest.getCity());
		billingAddress.setState(apiRequest.getState());
		billingAddress.setZip(apiRequest.getZip());
		
		
		Date d1 = new Date();
		String user= "egen";
		
		item.setItem_name(apiRequest.getItem_name());
		item.setItem_Price(apiRequest.getItem_Price());
		item.setCreate_TS(d1.toString());
		item.setUpdate_TS(d1.toString());
		item.setInserted_By(user);
		item.setUpdated_By(user);
		
		
		order.setAddress_id(apiRequest.getAddress_id());
		order.setBilling_Address_id(apiRequest.getBilling_Address_id());
		order.setCreate_TS(d1.toString());
		order.setCustomer_id(apiRequest.getCustomer_id());
		order.setInserted_By(user);
		order.setItem_id(apiRequest.getItem_id());
		order.setItem_Qty(apiRequest.getItem_Qty());
		order.setOrder_id(apiRequest.getOrder_id());
		order.setShipping_Method_id(apiRequest.getShipping_Method_id());
		order.setStatus(apiRequest.getState());
		order.setUpdate_TS(d1.toString());
		order.setUpdated_By(user);
		
		orderTotal.setShipping_method_id(apiRequest.getShipping_Method_id());
		orderTotal.setSubtotal(apiRequest.getSubtotal());
		orderTotal.setTax(apiRequest.getTax());
		orderTotal.setTotal_amount(apiRequest.getTotal_amount());
		
		
		payment.setBilling_Address_id(apiRequest.getBilling_Address_id());
		payment.setNo_of_Cards_Used(apiRequest.getNo_of_Cards_Used());
		payment.setOrder_id(apiRequest.getOrder_id());
		payment.setPayment_method(apiRequest.getPayment_method());



		
		
		
		
		ResponseOrder responseOrder = new ResponseOrder();
		
		
		
		return responseOrder;
	}
	
}
