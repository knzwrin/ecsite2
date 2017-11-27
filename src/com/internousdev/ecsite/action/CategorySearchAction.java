package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.CategorySearchDAO;
import com.internousdev.ecsite.dto.SearchDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CategorySearchAction extends ActionSupport implements SessionAware{
	private String categoryId;
	public Map<String,Object> session;
	private CategorySearchDAO categorySearchDAO = new CategorySearchDAO();
	private ArrayList<SearchDTO> searchDTO = new ArrayList<SearchDTO>();

	public String execute() throws SQLException{
		System.out.println(categoryId);
		String result = SUCCESS;
		session.put("categoryId", categoryId);
		searchDTO = categorySearchDAO.getItemInfo(categoryId);
		Iterator<SearchDTO> iterator = searchDTO.iterator();
		if (!(iterator.hasNext())) {
			result = ERROR;
			return result;
		}
		return result;
	}


	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public ArrayList<SearchDTO> getSearchDTO() {
		return searchDTO;
	}

	public void setSearchDTO(ArrayList<SearchDTO> searchDTO) {
		this.searchDTO = searchDTO;
	}

}
