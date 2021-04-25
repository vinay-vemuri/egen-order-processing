package com.ecommerce.orderprocessing.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties()
public class ResponseOrder {

	private String orderId;
	private String result;
}
