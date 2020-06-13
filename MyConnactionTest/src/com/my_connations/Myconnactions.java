package com.my_connations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myconnactions {

	static String url = "jdbc:mysql://localhost:3306/Dummy";
	static String userName = "root";
	static String passWord = "root";

	public static void main(String[] args) throws SQLException {

		Connection con=null;
		
		try {
			
           			con=DriverManager.getConnection(url, userName, passWord);
           			System.out.println("Connaction Established to MySql Databse");
			
		} catch (Exception e) {

			
			System.out.println("Connactons Fails");
		}finally {
			
			con.close();
		}
		
	}

}
