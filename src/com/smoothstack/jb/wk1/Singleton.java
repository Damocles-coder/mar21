package com.smoothstack.jb.wk1;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Singleton{
	public static class SampleSingleton {
	
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
		
		public static void databaseQuery(BigDecimal input) throws SQLException {
			conn = DriverManager.getConnection("url of database");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
			int x = 0;
			while(rs.next()) {
				x = rs.getInt(1) * input.intValue();
			}
		}
	}
}
