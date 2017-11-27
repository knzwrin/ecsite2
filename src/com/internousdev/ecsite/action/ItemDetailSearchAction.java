package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemDetailSearchDAO;
import com.internousdev.ecsite.dto.ItemDetailSearchDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailSearchAction extends ActionSupport implements SessionAware{

	private String itemId;
	public Map<String, Object> session;
	private ItemDetailSearchDAO itemDetailSearchDAO = new ItemDetailSearchDAO();
	private ItemDetailSearchDTO itemDetailSearchDTO = new ItemDetailSearchDTO();

	public String execute(){
		String result = SUCCESS;
		System.out.println(itemId);
		itemDetailSearchDTO = itemDetailSearchDAO.getItemDetailInfo(itemId);
		session.put("itemId", itemDetailSearchDTO.getItemId());
		session.put("itemName", itemDetailSearchDTO.getItemName());
		session.put("itemPrice", itemDetailSearchDTO.getItemPrice());
		session.put("itemImg", itemDetailSearchDTO.getItemImg());
		session.put("categoryId", itemDetailSearchDTO.getCategoryId());
		session.put("itemDtail", itemDetailSearchDTO.getItemDtail());
		session.put("categoryWord", itemDetailSearchDTO.getCategoryWord());
		session.put("insert_date", itemDetailSearchDTO.getInsert_date());
		System.out.println(itemDetailSearchDTO.getItemName());
		return result;
	}


	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
}
