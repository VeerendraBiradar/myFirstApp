package com.vbk.ghp.dto;

public class StudentCollege {

	private String USN;
	private String collegeName;
	private String universityName;
	private String collegeAddess;
	private String branch;
	
	public StudentCollege() {
		super();
		
	}

 	public String getUSN() {
		return USN;
	}

	public void setUSN(String uSN) {
		USN = uSN;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getCollegeAddess() {
		return collegeAddess;
	}

	public void setCollegeAddess(String collegeAddess) {
		this.collegeAddess = collegeAddess;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "StudentCollege [USN=" + USN + ", collegeName=" + collegeName + ", universityName=" + universityName
				+ ", collegeAddess=" + collegeAddess + ", branch=" + branch + "]";
	}

	
}
