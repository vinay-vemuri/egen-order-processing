package com.ecommerce.orderprocessing.tables;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	@Id
	private String Item_id;
	private String Item_name;
	private String Item_Price;
	private String Create_TS;
	private String Update_TS;
	private String Inserted_By;
	private String Updated_By;
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
	

}
