package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.ItemDetailSearchDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemDetailSearchDAO {

	private DBConnector dbConnector = new DBConnector();
    private Connection connection = dbConnector.getConnection();
    private ItemDetailSearchDTO itemDetailSearchDTO = new ItemDetailSearchDTO();

    public ItemDetailSearchDTO getItemDetailInfo(String itemId){
    	String sql = "select*from item_info where item_id = ?";

    	try{
	    	PreparedStatement preparedStatement = connection.prepareStatement(sql);
	    	preparedStatement.setString(1, itemId);

	    	ResultSet resultSet = preparedStatement.executeQuery();

	    	if(resultSet.next()){
	    		itemDetailSearchDTO.setItemId(resultSet.getString("item_id"));
	    		itemDetailSearchDTO.setItemName(resultSet.getString("item_name"));
	    		itemDetailSearchDTO.setItemPrice(resultSet.getString("item_price"));
	    		itemDetailSearchDTO.setItemImg(resultSet.getString("item_img"));
	    		itemDetailSearchDTO.setItemDtail(resultSet.getString("item_detail"));
	    		itemDetailSearchDTO.setCategoryId(resultSet.getString("category_id"));
	    		itemDetailSearchDTO.setCategoryWord(resultSet.getString("category_word"));
	    		itemDetailSearchDTO.setInsert_date(resultSet.getString("insert_date"));
	    	}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return itemDetailSearchDTO;
	}
}
