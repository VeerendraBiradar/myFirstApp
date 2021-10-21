package com.vbk.ghp.dto;

public class ParentsName {

	private String fatherFirstName;
	private String fatherLastName;
	private String motherName;
	
	public ParentsName() {
		super();
		
	}

	public ParentsName(String fatherFirstName, String fatherLastName, String motherName) {
		super();
		this.fatherFirstName = fatherFirstName;
		this.fatherLastName = fatherLastName;
		this.motherName = motherName;
	}

	public String getFatherFirstName() {
		return fatherFirstName;
	}

	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}

	public String getFatherLastName() {
		return fatherLastName;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	@Override
	public String toString() {
		return "ParentsName [fatherFirstName=" + fatherFirstName + ", fatherLastName=" + fatherLastName
				+ ", motherName=" + motherName + "]";
	}
	
	
	
	
}
