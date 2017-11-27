package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String userName;
	private String password;
	private String errorMessage;
	private String flg;
	public Map<String, Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();

//	public String execute() {
//
//		String result = ERROR;
//
//		loginDTO = loginDAO.getLoginUserInfo(userName, password);
//
//		session.put("loginUser", loginDTO);
//		session.put("userName" ,loginDTO.getUserName());//ちょくちょく使う値は別でsessionにいれる？
//
//
//		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
//			result = SUCCESS;
//			return result;
//		}
//
//		return result;
//	}

	public String execute() {

		String result = ERROR;

		loginDTO = loginDAO.getLoginUserInfo(userName, password);

//		session.put("loginUser", loginDTO);
		session.put("userId",loginDTO.getUserId());
		session.put("userName" ,loginDTO.getUserName());


		if(loginDTO.getLoginFlg()) {
			if(flg.equals("home")){
				result = "home";
				return result;
			}else if(flg.equals("mypage")){
				result = "mypage";
				return result;
			}
			result = SUCCESS;
			return result;
		}

		setErrorMessage("ログインに失敗しました");
		System.out.println(getErrorMessage());
		return result;
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


	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String getFlg() {
		return flg;
	}

	public void setFlg(String flg) {
		this.flg = flg;
	}
}