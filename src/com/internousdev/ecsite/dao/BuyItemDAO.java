package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class BuyItemDAO {
		private DBConnector dbConnector = new DBConnector();

		private Connection connection = dbConnector.getConnection();

		private DateUtil dateUtil = new DateUtil();

		private String sql = "INSERT INTO buy_item_info (user_id, user_name, item_name, total_price, count, pay, insert_date) VALUES(?, ?, ?, ?, ?, ?, ?)";


		public void buyItemInfo(String userId, String userName, String itemName, String total_price, String count, String pay) throws SQLException {

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, userId);
				preparedStatement.setString(2, userName);
				preparedStatement.setString(3, itemName);
				preparedStatement.setString(4, total_price);
				preparedStatement.setString(5, count);
				preparedStatement.setString(6, pay);
				preparedStatement.setString(7, dateUtil.getDate());

				preparedStatement.execute();

			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}
		}
	}
