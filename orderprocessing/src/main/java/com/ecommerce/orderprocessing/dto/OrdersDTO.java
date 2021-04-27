package com.ecommerce.orderprocessing.dto;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class OrdersDTO {
	private String orderId;
	private String customerId;
	private String status;
	private String addressId;
	private String shippingId;
	private String billingAddressId;
	private String itemId;
	private String itemQty;
	private String createTS;
	private String updateTS;
	private String insertedBy;
	private String message;
	
	public OrdersDTO() {
		
	}
	
	public String getOrderId() {
		return orderId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public String getStatus() {
		return status;
	}
	public String getAddressId() {
		return addressId;
	}
	public String getShippingId() {
		return shippingId;
	}
	public String getBillingAddressId() {
		return billingAddressId;
	}
	public String getItemId() {
		return itemId;
	}
	public String getItemQty() {
		return itemQty;
	}
	public String getCreateTS() {
		return createTS;
	}
	public String getUpdateTS() {
		return updateTS;
	}
	public String getInsertedBy() {
		return insertedBy;
	}
	public String getMessage() {
		return message;
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public void setShippingId(String shippingId) {
		this.shippingId = shippingId;
	}

	public void setBillingAddressId(String billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public void setItemQty(String itemQty) {
		this.itemQty = itemQty;
	}

	public void setCreateTS(String createTS) {
		this.createTS = createTS;
	}

	public void setUpdateTS(String updateTS) {
		this.updateTS = updateTS;
	}

	public void setInsertedBy(String insertedBy) {
		this.insertedBy = insertedBy;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
