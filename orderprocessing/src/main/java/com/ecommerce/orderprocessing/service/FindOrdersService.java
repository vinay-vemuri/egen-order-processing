package com.ecommerce.orderprocessing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.orderprocessing.models.OrderDetails;
import com.ecommerce.orderprocessing.repository.BillingAddressRepository;
import com.ecommerce.orderprocessing.repository.ItemRepository;
import com.ecommerce.orderprocessing.repository.OrderRepository;
import com.ecommerce.orderprocessing.repository.OrderTotalRepository;
import com.ecommerce.orderprocessing.repository.PaymentRepository;
import com.ecommerce.orderprocessing.repository.ShippingMethodRepository;
import com.ecommerce.orderprocessing.request.RequestOrder;
import com.ecommerce.orderprocessing.tables.BillingAddress;
import com.ecommerce.orderprocessing.tables.Item;
import com.ecommerce.orderprocessing.tables.Order;
import com.ecommerce.orderprocessing.tables.OrderTotal;
import com.ecommerce.orderprocessing.tables.Payment;
import com.ecommerce.orderprocessing.tables.ShippingMethod;

@Service
public class FindOrdersService {
	
	@Autowired
	public OrderRepository orderRepo;
	
	@Autowired
	public BillingAddressRepository billingAddressRepo;
	
	@Autowired
	public ItemRepository itemRepository;
	
	@Autowired
	public OrderTotalRepository orderTotalRepository;
	
	@Autowired
	public PaymentRepository paymentRepository;
	
	@Autowired
	public ShippingMethodRepository shippingMethodRepository;
	
	public RequestOrder getOrderDetailsById(String id) {
		
		RequestOrder ro = new RequestOrder();
		
		Order od = orderRepo.findById(id).get();
		ro.setOrder_id(od.getOrder_id());
		ro.setCustomer_id(od.getCustomer_id());
		ro.setStatus(od.getStatus());
		ro.setAddress_id(od.getAddress_id());
		ro.setShipping_Method_id(od.getShipping_Method_id());
		ro.setBilling_Address_id(od.getBilling_Address_id());
		ro.setItem_id(od.getItem_id());
		ro.setItem_Qty(od.getItem_Qty());
		
		BillingAddress ba = billingAddressRepo.findById(od.getBilling_Address_id()).get();
		ro.setAddress_line_1(ba.getAddress_line_1());
		ro.setAddress_line_2(ba.getAddress_line_2());
		ro.setCity(ba.getCity());
		ro.setState(ba.getState());
		ro.setZip(ba.getZip());
		
		Item item = itemRepository.findById(od.getItem_id()).get();
		ro.setItem_name(item.getItem_name());
		ro.setItem_Price(item.getItem_Price());
		
		OrderTotal ot = orderTotalRepository.findById(od.getOrder_id()).get();
		ro.setSubtotal(ot.getSubtotal());
		ro.setTax(ot.getTax());
		ro.setTotal_amount(ot.getTotal_amount());
		
		Payment payment = paymentRepository.findById(od.getOrder_id()).get();
		ro.setPayment_method(payment.getPayment_method());
		ro.setNo_of_Cards_Used(payment.getNo_of_Cards_Used());
		
		ShippingMethod sm = shippingMethodRepository.findById(od.getShipping_Method_id()).get();
		ro.setShipping_Charges(sm.getShipping_Charges());
		ro.setMethod(sm.getMethod());
				
		return ro;
	}
	
}
