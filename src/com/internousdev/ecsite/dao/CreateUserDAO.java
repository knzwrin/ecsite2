package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class CreateUserDAO {
	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO user_info (user_name, password, postal_code, address, tell, email, insert_date) VALUES(?, ?, ?, ?, ?, ?, ?)";

	public void createUser(String userName, String password, String postalCode, String address, String tell, String email) throws SQLException {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, postalCode);
			preparedStatement.setString(4, address);
			preparedStatement.setString(5, tell);
			preparedStatement.setString(6, email);
			preparedStatement.setString(7, dateUtil.getDate());

			preparedStatement.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
}
