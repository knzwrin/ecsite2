package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.CreateUserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserComplateAction extends ActionSupport implements SessionAware{
	private String userName;
	private String password;
	private String postalCode;
	private String address;
	private String tell;
	private String email;
	public Map<String,Object> session;
	private CreateUserDAO createUserDAO = new CreateUserDAO();

	public String execute() throws SQLException{

		createUserDAO.createUser(userName, password, postalCode, address, tell, email);

		return SUCCESS;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
