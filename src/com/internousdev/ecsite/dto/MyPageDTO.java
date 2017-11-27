package com.internousdev.ecsite.dto;

public class MyPageDTO {
	public String userId;

	public String userName;

	public String itemName;

	public String totalPrice;

	public String count;

	public String pay;

	public String insert_date;



	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getInsert_date() {
		return insert_date;
	}

	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

}
//id int not null primary key auto_increment,
//user_name varchar(16)
//item_name varchar(50),
//total_price int,
//count int,
//pay varchar(30),
//insert_date datetime,
//delete_date datetime
//);