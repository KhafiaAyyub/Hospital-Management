package com.springBoot.Hospital.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.Hospital.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
