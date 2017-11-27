package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private LoginDTO loginDTO = new LoginDTO();


	public LoginDTO getLoginUserInfo(String userName, String password) {

		String sql = "SELECT * FROM user_info where user_name = ? AND password = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				loginDTO.setUserId(resultSet.getString("user_id"));
				loginDTO.setUserName(resultSet.getString("user_name"));
				loginDTO.setPassword(resultSet.getString("Password"));
				loginDTO.setPostalCode(resultSet.getString("postal_code"));
				loginDTO.setAddress(resultSet.getString("address"));
				loginDTO.setTell(resultSet.getString("tell"));
				loginDTO.setEmail(resultSet.getString("email"));

				if(!(resultSet.getString("user_name").equals(null))) {
					loginDTO.setLoginFlg(true);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		return loginDTO;
	}
}
