package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BackItemDetailSearchAction  extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	public String execute(){
		String result = ERROR;

		if(session.containsKey("searchWord")){
			result = "word";
			return result;
		}else if(session.containsKey("categoryId")){
			result = "category";
			return result;
		}
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
