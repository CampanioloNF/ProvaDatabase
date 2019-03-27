package it.polito.tdp.provadb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
	
		String jdbcURL = "jdbc:mysql://localhost/dizionario?user=root&password=root" ;
		try {
			Connection conn = DriverManager.getConnection(jdbcURL) ;
			return conn ;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}

}
