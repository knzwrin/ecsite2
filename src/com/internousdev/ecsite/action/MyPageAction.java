package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MyPageDAO;
import com.internousdev.ecsite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private MyPageDAO myPageDAO = new MyPageDAO();
	public ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException{
		String result= ERROR;//errorの場合はlogin.jsp
		if(session.containsKey("userName")){
			result = SUCCESS;
			if(deleteFlg == null) {
//				String userId = session.get("userId").toString();
//				String userName = session.get("userName").toString();

				myPageList = myPageDAO.getMyPageInfo(session.get("userId").toString(), session.get("userName").toString());

				Iterator<MyPageDTO> iterator = myPageList.iterator();
				if (!(iterator.hasNext())) {
					myPageList = null;
					}
			} else if(deleteFlg.equals("1")) {
					delete();
			}
				return result;
		}
		return result;
	}

	public void delete() throws SQLException {

//		String userId = session.get("userId").toString();
//		String userName = session.get("userName").toString();

		int res = myPageDAO.HistoryDelete(session.get("userId").toString(), session.get("userName").toString());

		if(res > 0) {
			myPageList = null;
			setMessage("商品情報を正しく削除しました。");
		} else if(res == 0) {
			setMessage("商品情報の削除に失敗しました。");

		}
	}


	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
}
