package com.vbk.ghp.dto;

public class PersonalIDs {

	private String PANno;
	private String aadharNo;

	public PersonalIDs() {
		super();

	}

	public String getPANno() {
		return PANno;
	}

	public void setPANno(String pANno) {
		PANno = pANno;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	@Override
	public String toString() {
		return "PersonalIDs [PANno=" + PANno + ", aadharNo=" + aadharNo + "]";
	}


}
