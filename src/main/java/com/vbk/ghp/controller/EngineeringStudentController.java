package com.vbk.ghp.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vbk.ghp.dto.Addresses;
import com.vbk.ghp.dto.EngineeringStudentDTO;
import com.vbk.ghp.dto.MobileNumbers;
import com.vbk.ghp.dto.ParentsName;
import com.vbk.ghp.dto.PersonalIDs;
import com.vbk.ghp.dto.StudentCollege;
import com.vbk.ghp.dto.StudentName;

@RestController
public class EngineeringStudentController {

	@GetMapping("/engg/student")
	public List<EngineeringStudentDTO> getDetailsOfAllStudents() {

		StudentName studentname = new StudentName();
		studentname.setStudentFirstName("Prakash");
		studentname.setStudentLastName("Koppal");

		ParentsName parentsname = new ParentsName();
		parentsname.setFatherFirstName("Tulajappa");
		parentsname.setFatherLastName("Koppal");
		parentsname.setMotherName("Amma");

		PersonalIDs personalIDs = new PersonalIDs();
		personalIDs.setPANno("PARKY89543K");
		personalIDs.setAadharNo("554302632111");

		StudentCollege studentCollege = new StudentCollege();
		studentCollege.setUSN("3RM16EC146");
		studentCollege.setBranch("ECE");
		studentCollege.setCollegeName("Rammayya Institute of Technology");
		studentCollege.setCollegeAddess("BHEL road Mattikere , Banglore");
		studentCollege.setUniversityName("Autonomous Rammayya University");

		MobileNumbers mobileNumber = new MobileNumbers();
		mobileNumber.setFatherMobileNumber("9110289543");
		mobileNumber.setStudentMobileNumber("7090565991");
		
		Addresses addrerss = new Addresses();
		addrerss.setStudentTemporayAddress("Home no. 1/48 BHEL road Mattikere , Banglore");
		addrerss.setStudentTemporayAddress("Home no. 189 Hatti, Raichur");
		addrerss.setMobileNumber(mobileNumber);
		

		EngineeringStudentDTO esd = new EngineeringStudentDTO();
		esd.setId(12476);
		esd.setStudentName(studentname);
		esd.setParentNames(parentsname);
		esd.setPersonalIDs(personalIDs);
		esd.setStudentCollege(studentCollege);
		esd.setAddress(addrerss);

		List<EngineeringStudentDTO> studentDetailsList = new ArrayList<EngineeringStudentDTO>();
		studentDetailsList.add(esd);
		
		
		return studentDetailsList;


	}

}
