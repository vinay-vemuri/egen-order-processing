package com.ecommerce.orderprocessing.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.orderprocessing.repository.BillingAddressRepository;
import com.ecommerce.orderprocessing.repository.ItemRepository;
import com.ecommerce.orderprocessing.repository.OrderRepository;
import com.ecommerce.orderprocessing.repository.OrderTotalRepository;
import com.ecommerce.orderprocessing.repository.PaymentRepository;
import com.ecommerce.orderprocessing.repository.ShippingMethodRepository;
import com.ecommerce.orderprocessing.repository.ShippingRepository;
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
	
	@Autowired
	public BillingAddressRepository billingAddressRepository;
	
	@Autowired
	public ItemRepository itemRepo;
	
	@Autowired
	public OrderRepository orderRepo;
	
	@Autowired
	public OrderTotalRepository orderTotalRepo;
	
	@Autowired
	public PaymentRepository paymentRepo;
	
	@Autowired
	public ShippingMethodRepository shippingMethodRepo;
	
	@Autowired
	public ShippingRepository shippingRepo;
	
	public ResponseOrder createOrder(RequestOrder apiRequest) {
		
		BillingAddress billingAddress = new BillingAddress();
		Item item = new Item();
		Order order = new Order();
		OrderTotal orderTotal = new OrderTotal();
		Payment payment = new Payment();
		Shipping shipping = new Shipping();
		ShippingMethod shippingMethod = new ShippingMethod();
		
		String uniqueBillingAddressId = UUID.randomUUID().toString();
		
		billingAddress.setBilling_Address_id(uniqueBillingAddressId);
		billingAddress.setAddress_line_1(apiRequest.getAddress_line_1());
		billingAddress.setAddress_line_2(apiRequest.getAddress_line_2());
		billingAddress.setCity(apiRequest.getCity());
		billingAddress.setState(apiRequest.getState());
		billingAddress.setZip(apiRequest.getZip());
		
		billingAddressRepository.save(billingAddress);
		
		Date d1 = new Date();
		String user= "egen";
		
		String uniqueItemId = UUID.randomUUID().toString();
		
		item.setItem_id(uniqueItemId);
		item.setItem_name(apiRequest.getItem_name());
		item.setItem_Price(apiRequest.getItem_Price());
		item.setCreate_TS(d1.toString());
		item.setUpdate_TS(d1.toString());
		item.setInserted_By(user);
		item.setUpdated_By(user);
		
		itemRepo.save(item);
		
		String uniqueAddressId = UUID.randomUUID().toString();
		
		String uniqueOrderId = UUID.randomUUID().toString();
		
		String uniqueShippingMethodId = UUID.randomUUID().toString();
		
		
		order.setAddress_id(uniqueAddressId);
		order.setBilling_Address_id(uniqueBillingAddressId);
		order.setCreate_TS(d1.toString());
		order.setCustomer_id(apiRequest.getCustomer_id());
		order.setInserted_By(user);
		order.setItem_id(uniqueItemId);
		order.setItem_Qty(apiRequest.getItem_Qty());
		order.setOrder_id(uniqueOrderId);
		order.setShipping_Method_id(uniqueShippingMethodId);
		order.setStatus("NEW");
		order.setUpdate_TS(d1.toString());
		order.setUpdated_By(user);
		
		orderRepo.save(order);
		
		orderTotal.setShipping_method_id(uniqueShippingMethodId);
		orderTotal.setSubtotal(apiRequest.getSubtotal());
		orderTotal.setTax(apiRequest.getTax());
		orderTotal.setTotal_amount(apiRequest.getTotal_amount());
		
		orderTotalRepo.save(orderTotal);		
		
		payment.setBilling_Address_id(uniqueBillingAddressId);
		payment.setNo_of_Cards_Used(apiRequest.getNo_of_Cards_Used());
		payment.setOrder_id(uniqueOrderId);
		payment.setPayment_method(apiRequest.getPayment_method());
		
		paymentRepo.save(payment);
		
		shippingMethod.setMethod(apiRequest.getMethod());
		shippingMethod.setShipping_Charges(apiRequest.getShipping_Charges());
		shippingMethod.setShipping_Method_id(uniqueShippingMethodId);
		
		shippingMethodRepo.save(shippingMethod);
		
		shipping.setAddress_id(uniqueAddressId);
		shipping.setAddress_line_1(apiRequest.getAddress_line_1());
		shipping.setAddress_line_2(apiRequest.getAddress_line_2());
		shipping.setCity(apiRequest.getCity());
		shipping.setState(apiRequest.getState());
		shipping.setZip(apiRequest.getZip());
		shipping.setCreate_TS(d1.toString());
		shipping.setUpdate_TS(d1.toString());
		shipping.setInserted_By(user);
		shipping.setUpdated_By(user);
		
		shippingRepo.save(shipping);
		
		ResponseOrder responseOrder = new ResponseOrder();
		responseOrder.setMessage("Created Order  Successfully");
		responseOrder.setOrderId(uniqueOrderId);
		return responseOrder;
	}
	
}
