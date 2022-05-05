package com.devopsyoda.universityapp.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHandlerService{
	public Connection createDBConnection() {
		Connection con = null;
		try 
		{
			Properties properties = new Properties();
			FileReader file = new FileReader("src/main/resources/connection.properties");
			properties.load(file);
			String connectionURL = properties.getProperty("connection-url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			con = DriverManager.getConnection(connectionURL, username, password);
		}
		catch(FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return con;
	}
}
