package com.ecommerce.orderprocessing.tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipping")
public class Shipping {
	@Id
	private String Address_id;
	private String address_line_1;
	private String address_line_2;
	private String City;
	private String State;
	private String Zip;
	private String Create_TS;
	private String Update_TS;
	private String Inserted_By;
	public String getAddress_id() {
		return Address_id;
	}
	public void setAddress_id(String address_id) {
		Address_id = address_id;
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
	private String Updated_By;
	
	
	
}
