package com.devopsyoda.universityapp.model;

public class Students {
	private int studentRollNumber;
	private String studentName;
	private String studentEmail;
	private String studentCity;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public int getStudentRollNumber() {
		return studentRollNumber;
	}
	int tempRollNumber = 1;
	public Students(String studentName, String studentEmail, String studentCity) {
		super();
		this.studentRollNumber = tempRollNumber;
		tempRollNumber++;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentCity = studentCity;
	}
}
