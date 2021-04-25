package com.ecommerce.orderprocessing.tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipping_method")
public class ShippingMethod {
	@Id
	private String Shipping_Method_id;
	private String Method;
	private String Shipping_Charges;

	public String getShipping_Method_id() {
		return Shipping_Method_id;
	}

	public void setShipping_Method_id(String shipping_Method_id) {
		Shipping_Method_id = shipping_Method_id;
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

}
