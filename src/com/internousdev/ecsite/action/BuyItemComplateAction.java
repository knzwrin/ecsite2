package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemComplateAction extends ActionSupport implements SessionAware{
//	private CartDeleteDAO cartDeleteDAO = new CartDeleteDAO();
	public Map<String,Object> session;

	public String execute() throws SQLException {

		String result = SUCCESS;
//
//		/*購入したカート情報削除*/
//		cartDeleteDAO.cartInfoDelete(
//				session.get("itemId").toString(),
//				session.get("userName").toString()
//				);

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
