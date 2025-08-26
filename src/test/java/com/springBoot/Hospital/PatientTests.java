package com.springBoot.Hospital;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springBoot.Hospital.Entity.Patient;
import com.springBoot.Hospital.Entity.Type.BloodGroupType;
import com.springBoot.Hospital.Service.PatientService;
import com.springBoot.Hospital.respository.PatientRepository;

@SpringBootTest
public class PatientTests {

	@Autowired
	private PatientRepository patientRepository ;
	
	@Autowired
	private PatientService patientService ;
	
	@Test
	public void testPatientRepository() {
		List<Patient> patientList = patientRepository.findAll(); // select * from patient; 
		System.out.println(patientList);
	}
	
	
//	@Test
//	public void testTransactionMethods() {
//		Patient patient =  patientService.getPatientById(1L);
//		System.out.println(patient);
//	}
//	
	@Test
	public void testTransactionMethods() {

	//OR
//	Patient patient = patientRepository.findByName("John Doe");
//    List<Patient> patientList = patientRepository.findByBirthDateOrEmail(LocalDate.of(1990,8,27), "john@example.com");
		
//    for (Patient patient : patientList) {
//    	System.out.println(patient);
//	}
    
		//LIKE
//    List<Patient> patientList = patientRepository.findByNameContaining("er");
//
//  for (Patient patient : patientList) {
//	System.out.println(patient);
//} 
		
		//ORDER BY ID DESC
//		List<Patient> patientList = patientRepository.findByNameContainingOrderByIdDesc("er");
//    
//		 for (Patient patient : patientList) {
//				System.out.println(patient);
//			}
    
		 // Blood group JPQL
			List<Patient> patientList = patientRepository.findByBloodGroup(BloodGroupType.A_POSITIVE);
		    
			 for (Patient patient : patientList) {
					System.out.println(patient);
				
			 }
		
	}
	
}
