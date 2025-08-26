package com.springBoot.Hospital;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

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
		//			List<Patient> patientList = patientRepository.findByBloodGroup(BloodGroupType.A_POSITIVE);
		//		    
		//			 for (Patient patient : patientList) {
		//					System.out.println(patient);	
		//			 }

		// To find the patient who is born after this date 
		//		List<Patient> patientList = patientRepository.findByBornAfterDate(LocalDate.of(1999,1,1));
		//
		//		for (Patient patient : patientList) {
		//			System.out.println(patient);	
		//		}


		//group by query
		//		List<Object[]> bloodGroupList = patientRepository.countEachBloodGroupType();
		//
		//		for (Object[] objects : bloodGroupList) {
		//			System.out.println(objects[0] + " "+ objects[1]);
		//		}

		//native query - find All Patient
		//		List<Patient> patientList = patientRepository.findAllPatients();
		//		
		//		for (Patient patient : patientList) {
		//			System.out.println(patient);
		//		}

		//update query
		//		int rowsUpdated = patientRepository.updateNameWithId("RUNNN", 1L);
		//		System.out.println(rowsUpdated);
		
		//Pagination
		
		Page<Patient> patientList = patientRepository.findAllPatient(PageRequest.of(1, 2));		
		for (Patient patient : patientList) {
			System.out.println(patient);
		}
		
		
	}

}
