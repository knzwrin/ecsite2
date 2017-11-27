package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class CartDeleteDAO {
	private DBConnector dbConnector = new DBConnector();
    private Connection connection = dbConnector.getConnection();

     public void cartInfoDelete(String itemId , String userName) throws SQLException{
    	 String sql = "delete from cart_info item_id = ? and user_name = ?";

    	 try{
    		 PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		 preparedStatement.setString(1, itemId);
    		 preparedStatement.setString(2, userName);
    		 preparedStatement.execute();
    	 }catch(SQLException e){
    		 e.printStackTrace();
    	 } finally {
 			connection.close();
 		}
     }
}
