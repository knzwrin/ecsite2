package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoLoginAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String flg;

	public String execute(){

		if(session.containsKey("userName")){
			String result = SUCCESS;
			return result;
		}
		flg = "home";
		String result = "login";
		return result;
	}


	public String getFlg() {
		return flg;
	}

	public void setFlg(String flg) {
		this.flg = flg;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
}
