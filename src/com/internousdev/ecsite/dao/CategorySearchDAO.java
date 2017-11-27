package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.SearchDTO;
import com.internousdev.ecsite.util.DBConnector;

public class CategorySearchDAO {

	private DBConnector dbConnector = new DBConnector();
    private Connection connection = dbConnector.getConnection();

    public ArrayList<SearchDTO> getItemInfo(String categoryId) throws SQLException {
    	System.out.println(categoryId);
    	ArrayList<SearchDTO> searchDTO = new ArrayList<SearchDTO>();
    	String sql = "select*from item_info where category_id = ?";

    	try{
	    	PreparedStatement preparedStatement = connection.prepareStatement(sql);
	    	preparedStatement.setString(1, categoryId);

	    	ResultSet resultSet = preparedStatement.executeQuery();

	    	while(resultSet.next()){
	    		SearchDTO dto = new SearchDTO();
				dto.setItemId(resultSet.getString("item_id"));
				dto.setItemName(resultSet.getString("item_name"));
//				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItemImg(resultSet.getString("item_img"));
//				dto.setItemDtail(resultSet.getString("item_detail"));
//				dto.setCategoryId(resultSet.getString("category_id"));
//				dto.setCategoryWord(resultSet.getString("category_word"));
//				dto.setInsert_date(resultSet.getString("insert_date"));
				searchDTO.add(dto);
	    	}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return searchDTO;
	}
}
