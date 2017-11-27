package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.SearchDTO;
import com.internousdev.ecsite.util.DBConnector;

public class WordSearchDAO {

	private DBConnector dbConnector = new DBConnector();
    private Connection connection = dbConnector.getConnection();

    public ArrayList<SearchDTO> getItemInfo(String searchWord) throws SQLException {

    	ArrayList<SearchDTO> searchDTO = new ArrayList<SearchDTO>();

		String word =searchWord.replaceAll(" ","　");

      String[] wordList = word.split("　");


		String tempsql = "SELECT * FROM item_info where ";
		String sql = "" ;
		int i =0;
		while(i<wordList.length){

			sql = sql + "category_word like \"%"+wordList[i]+"%\"";
					if((i+1)<wordList.length){
						sql = sql + " or ";
					}
					i++;
		}
		String mainsql = tempsql + sql +";";
		System.out.println(mainsql);
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(mainsql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
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
    }//ひとつのDAOにまとめる