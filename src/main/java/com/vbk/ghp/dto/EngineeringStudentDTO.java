package com.vbk.ghp.dto;

public class EngineeringStudentDTO {
	
	private long id;
	private StudentName studentName;
	private ParentsName parentNames;
	private PersonalIDs personalIDs;
	private StudentCollege StudentCollege;
	private Addresses address;
	
	
	public EngineeringStudentDTO() {
		super();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public StudentName getStudentName() {
		return studentName;
	}

	public void setStudentName(StudentName studentName) {
		this.studentName = studentName;
	}

	public ParentsName getParentNames() {
		return parentNames;
	}

	public void setParentNames(ParentsName parentNames) {
		this.parentNames = parentNames;
	}

	public PersonalIDs getPersonalIDs() {
		return personalIDs;
	}

	public void setPersonalIDs(PersonalIDs personalIDs) {
		this.personalIDs = personalIDs;
	}

	public StudentCollege getStudentCollege() {
		return StudentCollege;
	}

	public void setStudentCollege(StudentCollege studentCollege) {
		this.StudentCollege = studentCollege;
	}

	public Addresses getAddress() {
		return address;
	}

	public void setAddress(Addresses address) {
		this.address = address;
	}
}
