package com.smoothstack.jb.wk1;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Should not be static as you cannot instantiate these type of classes.
public class SampleSingleton {
	
	private static Connection conn = null;
	
	private volatile static SampleSingleton instance = null;
	
	private SampleSingleton() {
		
	}
	
	public static SampleSingleton getInstance() {
		if (instance == null) {
			synchronized (SampleSingleton.class) {
				if (instance==null) {
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}
	
	//Just fixed the big data so it could be converted to int,
	public static void databaseQuery(BigDecimal input) throws SQLException {
		try {
		conn = DriverManager.getConnection("url of database");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id from table");
		int x = 0;
		while(rs.next()) {
			x = rs.getInt(1) * input.intValue();
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			conn.close();
		}
	}
}