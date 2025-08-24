package com.springBoot.Hospital;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springBoot.Hospital.Entity.Patient;
import com.springBoot.Hospital.respository.PatientRepository;

@SpringBootTest
public class PatientTests {

	@Autowired
	private PatientRepository patientRepository ;
	
	@Test
	public void testPatientRepository() {
		List<Patient> patientList = patientRepository.findAll(); // select * from patient; 
		System.out.println(patientList);
	}
	
}
