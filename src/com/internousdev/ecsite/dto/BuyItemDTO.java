package com.internousdev.ecsite.dto;

public class BuyItemDTO {

	private int count;
	private String pay;
	private int totalPrice;


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}


	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
