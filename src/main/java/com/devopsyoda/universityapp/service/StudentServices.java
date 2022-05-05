package com.devopsyoda.universityapp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.devopsyoda.universityapp.model.Students;


public class StudentServices {
	
	// A Method to create a new Student
	public void createStudent(int rollNumber, String name, String email, String city) throws SQLException {
		Students s = new Students(name, email, city);
		ConnectionHandlerService chs = new ConnectionHandlerService();
		Connection con = chs.createDBConnection();
		if(con!=null) {
			System.out.println("Connected to DB");
		}
		String query = "insert into students values (?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, rollNumber);	
		pstmt.setString(2, name);
		pstmt.setString(3, email);
		pstmt.setString(4, city);
		pstmt.execute();
		pstmt.close();
		con.close();
	}
}
