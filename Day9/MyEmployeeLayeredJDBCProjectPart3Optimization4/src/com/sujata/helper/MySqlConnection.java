package com.sujata.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlConnection {

	
	public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
		
		Properties properties=new Properties();
		
		FileInputStream fileInputStream=new FileInputStream("DbConnection.properties");
		
		properties.load(fileInputStream);

		Class.forName(properties.getProperty("db.driverClassName"));

		Connection connection = DriverManager.getConnection(properties.getProperty("db.url"), properties.getProperty("db.userName"), properties.getProperty("db.password"));
		return connection;
	}
}
