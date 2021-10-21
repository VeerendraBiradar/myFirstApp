package com.vbk.ghp.dto;

public class MobileNumbers {

	private String studentMobileNumber;
	private String fatherMobileNumber;
	
	public MobileNumbers() {
		super();
	
	}

	public String getStudentMobileNumber() {
		return studentMobileNumber;
	}

	public void setStudentMobileNumber(String studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}

	public String getFatherMobileNumber() {
		return fatherMobileNumber;
	}

	public void setFatherMobileNumber(String fatherMobileNumber) {
		this.fatherMobileNumber = fatherMobileNumber;
	}

	@Override
	public String toString() {
		return "MobileNumbers [studentMobileNumber=" + studentMobileNumber + ", fatherMobileNumber="
				+ fatherMobileNumber + "]";
	}
	
}
