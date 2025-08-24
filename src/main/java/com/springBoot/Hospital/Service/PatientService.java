package com.springBoot.Hospital.Service;

import org.springframework.stereotype.Service;

import com.springBoot.Hospital.Entity.Patient;
import com.springBoot.Hospital.respository.PatientRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientService {

	private final PatientRepository patientRepository;
	
	
	@Transactional
	public Patient getPatientById(Long id) {
		
		Patient p1 = patientRepository.findById(id).orElseThrow();
		Patient p2 = patientRepository.findById(id).orElseThrow();
		
		return p1;
		
	}
	
	
}
