package com.pizzamanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Pizza {
	@Id
	private int pizzaNo;
	private String pizzaType;
	private int pizzaPrice;
	private String DeliveryAdd;
	
	
	
	public int getPizzaNo() {
		return pizzaNo;
	}

	public void setPizzaNo(int pizzaNo) {
		this.pizzaNo = pizzaNo;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public int getPizzaPrice() {
		return pizzaPrice;
	}

	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}

	public String getDeliveryAdd() {
		return DeliveryAdd;
	}

	public void setDeliveryAdd(String deliveryAdd) {
		DeliveryAdd = deliveryAdd;
	}

	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public Pizza(int pizzaNo, String pizzaType, int pizzaPrice, String deliveryAdd) {
		super();
		this.pizzaNo = pizzaNo;
		this.pizzaType = pizzaType;
		this.pizzaPrice = pizzaPrice;
		DeliveryAdd = deliveryAdd;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaNo=" + pizzaNo + ", pizzaType=" + pizzaType + ", pizzaPrice=" + pizzaPrice
				+ ", DeliveryAdd=" + DeliveryAdd + "]";
	}
	
	

}
