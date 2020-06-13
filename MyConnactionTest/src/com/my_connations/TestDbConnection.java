package com.my_connations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class TestDbConnection {
	public static void main(String[] args) throws SQLException {
         String aadhar_no;
		String url = "jdbc:mysql://localhost:3306/Dummy";
		String userName = "root";
		String passWord = "root";

		Connection con = null;
		
		

		try {

			

			con = DriverManager.getConnection(url, userName, passWord);

			if (con != null) {
				System.out.println("got the  connections");

				//CallableStatement call =con.prepareCall("{call  insertdata(231,'fdksghfkdh','2014-11-11',44)}");

				CallableStatement call =con.prepareCall("{call  getAadhar_no(?,?)}");
				call.setInt(1, 3);
				call.registerOutParameter(2, Types.VARCHAR);
				call.executeQuery();
				
				
				

				String name=call.getString(2);

				System.out.println(name);
				
			}

		} catch (Exception e) {
			System.out.println("got not connections");
			e.printStackTrace();
		}finally {
			
			con.close();
			
		}

		

	}
}
