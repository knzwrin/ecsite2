package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.UserCreateDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserAction extends ActionSupport implements SessionAware{
//	private String userId;
	private String userName;
	private String password;
	private String postalCode;
	private String address;
	private String tell;
	private String email;
	public Map<String,Object> session;
	private String errorMassage;
	private UserCreateDTO userCreateDTO = new UserCreateDTO();

	public String execute(){
		String result = ERROR;
		System.out.println(userName);
		System.out.println(password);
		if(!(userName.equals("")) && !(password.equals("")) && !(address.equals("")) && !(tell.equals("")) && !(email.equals(""))){
			if(userName.length() >= 6 && userName.length() <= 8 && password.length() >=8 && password.length() <= 16){
			userCreateDTO.setUserName(userName);//6以上10以下
			userCreateDTO.setPassword(password);//8以上16以下
			userCreateDTO.setPostalCode(postalCode);
			userCreateDTO.setAddress(address);
			userCreateDTO.setTell(tell);///////////////////////dtoにぶち込む
			userCreateDTO.setEmail(email);
			result = SUCCESS;
			return result;
			}
		}else{
			setErrorMassage("正しく入力してください!!!!!!");
		}
		return result;
	}

//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}

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

	public String getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}

	public UserCreateDTO getUserCreateDTO() {
		return userCreateDTO;
	}

	public void setUserCreateDTO(UserCreateDTO userCreateDTO) {
		this.userCreateDTO = userCreateDTO;
	}

}
