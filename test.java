package hospSpark;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		connect();
	}
	public static void connect() {
		Connection conn = null;
		String url = "jdbc:sqlite:hospital.db";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("Connection to SQLite has been established.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException ex) {
					System.out.println(ex.getMessage()); 
		         }
				        }
		    }  

}
