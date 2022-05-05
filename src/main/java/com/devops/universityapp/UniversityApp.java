package com.devops.universityapp;

import java.sql.SQLException;
import java.util.Scanner;

import com.devopsyoda.universityapp.model.Students;
import com.devopsyoda.universityapp.service.StudentServices;

public class UniversityApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int rollNumber = sc.nextInt();
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println("Enter Email:");
		String email = sc.nextLine();
		System.out.println("Enter City:");
		String city = sc.nextLine();
		Students s = new Students(name, email, city);
		int rollNumber = s.getStudentRollNumber();
		StudentServices studentServices = new StudentServices();
		studentServices.createStudent(rollNumber, name, email, city);
		System.out.println("Your roll Number is : "+rollNumber);
	}

}
