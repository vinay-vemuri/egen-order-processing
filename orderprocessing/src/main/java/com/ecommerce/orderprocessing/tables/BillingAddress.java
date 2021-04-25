package com.ecommerce.orderprocessing.tables;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "billingaddress")
public class BillingAddress {
	@Id
	private String Billing_Address_id;
	private String address_line_1;
	private String address_line_2;
	private String City;
	private String State;
	private String Zip;
	public String getBilling_Address_id() {
		return Billing_Address_id;
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
	
	

}
