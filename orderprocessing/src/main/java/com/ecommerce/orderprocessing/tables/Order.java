package com.ecommerce.orderprocessing.tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class Order {
	@Id
	private String Order_id;
	private String Customer_id;
	private String Status;
	private String Address_id;
	private String Shipping_Method_id;
	private String Billing_Address_id;
	private String Item_id;
	private String Item_Qty;
	private String Create_TS;
	private String Update_TS;
	private String Inserted_By;

	public String getOrder_id() {
		return Order_id;
	}

	public void setOrder_id(String order_id) {
		Order_id = order_id;
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

	public String getShipping_Method_id() {
		return Shipping_Method_id;
	}

	public void setShipping_Method_id(String shipping_Method_id) {
		Shipping_Method_id = shipping_Method_id;
	}

	public String getBilling_Address_id() {
		return Billing_Address_id;
	}

	public void setBilling_Address_id(String billing_Address_id) {
		Billing_Address_id = billing_Address_id;
	}

	public String getItem_id() {
		return Item_id;
	}

	public void setItem_id(String item_id) {
		Item_id = item_id;
	}

	public String getItem_Qty() {
		return Item_Qty;
	}

	public void setItem_Qty(String item_Qty) {
		Item_Qty = item_Qty;
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
