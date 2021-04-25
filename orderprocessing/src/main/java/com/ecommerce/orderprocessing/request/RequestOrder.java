package com.ecommerce.orderprocessing.request;

import org.springframework.stereotype.Component;

@Component
public class RequestOrder {
	
	private String Billing_Address_id;
	private String address_line_1;
	private String address_line_2;
	private String City;
	private String State;
	private String Zip;
	private String Item_id;
	private String Item_name;
	private String Item_Price;
	private String Create_TS;
	private String Update_TS;
	private String Inserted_By;
	private String Updated_By;
	private String Order_id;
	private String Customer_id;
	private String Status;
	private String Address_id;
	private String shipping_Method_id;
	private String Item_Qty;
	private String order_id;
	private String subtotal;
	private String tax;
	private String total_amount;
	private String Method;
	private String Shipping_Charges;
	private String No_of_Cards_Used;
	private String Payment_confirmation_number;
	private String Payment_method;

	public String getBilling_Address_id() {
		return Billing_Address_id;
	}
	public String getShipping_Method_id() {
		return shipping_Method_id;
	}
	public void setShipping_Method_id(String shipping_Method_id) {
		this.shipping_Method_id = shipping_Method_id;
	}
	public String getPayment_method() {
		return Payment_method;
	}
	public void setPayment_method(String payment_method) {
		Payment_method = payment_method;
	}
	public void setBilling_Address_id(String billing_Address_id) {
		Billing_Address_id = billing_Address_id;
	}
	public String getAddress_line_1() {
		return address_line_1;
	}
	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}
	public String getAddress_line_2() {
		return address_line_2;
	}
	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public String getItem_id() {
		return Item_id;
	}
	public void setItem_id(String item_id) {
		Item_id = item_id;
	}
	public String getItem_name() {
		return Item_name;
	}
	public void setItem_name(String item_name) {
		Item_name = item_name;
	}
	public String getItem_Price() {
		return Item_Price;
	}
	public void setItem_Price(String item_Price) {
		Item_Price = item_Price;
	}
	public String getCreate_TS() {
		return Create_TS;
	}
	public void setCreate_TS(String create_TS) {
		Create_TS = create_TS;
	}
	public String getUpdate_TS() {
		return Update_TS;
	}
	public void setUpdate_TS(String update_TS) {
		Update_TS = update_TS;
	}
	public String getInserted_By() {
		return Inserted_By;
	}
	public void setInserted_By(String inserted_By) {
		Inserted_By = inserted_By;
	}
	public String getUpdated_By() {
		return Updated_By;
	}
	public void setUpdated_By(String updated_By) {
		Updated_By = updated_By;
	}
	public String getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(String customer_id) {
		Customer_id = customer_id;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getAddress_id() {
		return Address_id;
	}
	public void setAddress_id(String address_id) {
		Address_id = address_id;
	}

	public String getItem_Qty() {
		return Item_Qty;
	}
	public void setItem_Qty(String item_Qty) {
		Item_Qty = item_Qty;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}
	public String getMethod() {
		return Method;
	}
	public void setMethod(String method) {
		Method = method;
	}
	public String getShipping_Charges() {
		return Shipping_Charges;
	}
	public void setShipping_Charges(String shipping_Charges) {
		Shipping_Charges = shipping_Charges;
	}	
	public String getNo_of_Cards_Used() {
		return No_of_Cards_Used;
	}
	public void setNo_of_Cards_Used(String no_of_Cards_Used) {
		No_of_Cards_Used = no_of_Cards_Used;
	}
	public String getPayment_confirmation_number() {
		return Payment_confirmation_number;
	}
	public void setPayment_confirmation_number(String payment_confirmation_number) {
		Payment_confirmation_number = payment_confirmation_number;
	}
	@Override
	public String toString() {
		return "RequestOrder [Billing_Address_id=" + Billing_Address_id + ", address_line_1=" + address_line_1
				+ ", address_line_2=" + address_line_2 + ", City=" + City + ", State=" + State + ", Zip=" + Zip
				+ ", Item_id=" + Item_id + ", Item_name=" + Item_name + ", Item_Price=" + Item_Price + ", Create_TS="
				+ Create_TS + ", Update_TS=" + Update_TS + ", Inserted_By=" + Inserted_By + ", Updated_By=" + Updated_By
				+ ", Order_id=" + Order_id + ", Customer_id=" + Customer_id + ", Status=" + Status + ", Address_id="
				+ Address_id + ", shipping_Method_id=" + shipping_Method_id + ", Item_Qty=" + Item_Qty + ", order_id="
				+ order_id + ", subtotal=" + subtotal + ", tax=" + tax + ", total_amount=" + total_amount + ", Method="
				+ Method + ", Shipping_Charges=" + Shipping_Charges + ", No_of_Cards_Used=" + No_of_Cards_Used
				+ ", Payment_confirmation_number=" + Payment_confirmation_number + "]";
	}
	
}




