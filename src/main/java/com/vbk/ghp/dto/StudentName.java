package com.vbk.ghp.dto;

public class StudentName {
	
	private String studentFirstName;
	private String studentLastName;
	
	public StudentName() {
		super();
		
	}

	public StudentName(String studentFirstName, String studentLastName) {
		super();
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	@Override
	public String toString() {
		return "StudentName [studentFirstName=" + studentFirstName + ", studentLastName=" + studentLastName + "]";
	}
	
	

	
}
