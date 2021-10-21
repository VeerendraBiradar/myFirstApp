package com.vbk.ghp.dto;

public class Addresses {
	
	private String studentTemporayAddress;
	private String studentPermanentAddress;
	private MobileNumbers mobileNumber;
	
	public Addresses() {
		super();
		
	}

	public String getStudentTemporayAddress() {
		return studentTemporayAddress;
	}

	public void setStudentTemporayAddress(String studentTemporayAddress) {
		this.studentTemporayAddress = studentTemporayAddress;
	}

	public String getStudentPermanentAddress() {
		return studentPermanentAddress;
	}

	public void setStudentPermanentAddress(String studentPermanentAddress) {
		this.studentPermanentAddress = studentPermanentAddress;
	}
	
	public MobileNumbers getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(MobileNumbers mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	

}
