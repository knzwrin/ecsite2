package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.util.PreIdCreate;
import com.opensymphony.xwork2.ActionSupport;

public class PreIdCreateAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private PreIdCreate preIdCreate = new PreIdCreate();

	public String execute(){
		String result = SUCCESS;
		String preId = preIdCreate.preIdCteate();
		session.put("preId", preId);
		return result;

	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
}
