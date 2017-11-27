package com.internousdev.ecsite.dto;

public class ItemDetailSearchDTO {

	private String itemId;
	private String itemName;
	private String itemPrice;
	private String itemImg;
	private String itemDtail;
	private String categoryId;
	private String categoryWord;
	private String insert_date;


	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}


	public String getItemImg() {
		return itemImg;
	}

	public void setItemImg(String itemImg) {
		this.itemImg = itemImg;
	}


	public String getItemDtail() {
		return itemDtail;
	}

	public void setItemDtail(String itemDtail) {
		this.itemDtail = itemDtail;
	}


	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryWord() {
		return categoryWord;
	}

	public void setCategoryWord(String categoryWord) {
		this.categoryWord = categoryWord;
	}


	public String getInsert_date() {
		return insert_date;
	}

	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}
}