package com.ecommerce.orderprocessing.tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_total")
public class OrderTotal {
	@Id
	private String order_id;
	private String shipping_method_id;
	private String subtotal;
	private String tax;
	private String total_amount;
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getShipping_method_id() {
		return shipping_method_id;
	}
	public void setShipping_method_id(String shipping_method_id) {
		this.shipping_method_id = shipping_method_id;
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
	
}
