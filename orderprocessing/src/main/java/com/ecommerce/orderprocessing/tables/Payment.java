package com.ecommerce.orderprocessing.tables;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	private String Order_id;
	private String Billing_Address_id;
	private String Payment_method;
	private String No_of_Cards_Used;
	private String Payment_confirmation_number;
	public String getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(String order_id) {
		Order_id = order_id;
	}
	public String getBilling_Address_id() {
		return Billing_Address_id;
	}
	public void setBilling_Address_id(String billing_Address_id) {
		Billing_Address_id = billing_Address_id;
	}
	public String getPayment_method() {
		return Payment_method;
	}
	public void setPayment_method(String payment_method) {
		Payment_method = payment_method;
	}
	public String getNo_of_Cards_Used() {
		return No_of_Cards_Used;
	}
	public void setNo_of_Cards_Used(String no_of_Cards_Used) {
		No_of_Cards_Used = no_of_Cards_Used;
	}
	
}
