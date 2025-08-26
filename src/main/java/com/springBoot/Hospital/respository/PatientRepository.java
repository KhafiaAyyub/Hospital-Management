package com.springBoot.Hospital.respository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springBoot.Hospital.Entity.Patient;
import com.springBoot.Hospital.Entity.Type.BloodGroupType;

public interface PatientRepository extends JpaRepository<Patient, Long> {

	Patient findByName(String name); //jpa query methods
	Patient findByBirthDate(LocalDate birthDate); //jpa query methods
//	Patient findByBirthDateOrEmail(LocalDate birthDate, String email); //passing two things
//or and not
//	Optional<Patient> findByBirthDateOrEmail(LocalDate birthDate, String email); //passing two things
//	List<Patient> findByBirthDateOrEmail(LocalDate birthDate, String email); //passing two things
	List<Patient> findByBirthDateOrEmail(LocalDate of, String email);

	
	//find by -
	//Name - go to entity and check the column - camel case- variable name as it as 
	
	List<Patient> findByBirthDateBetween(LocalDate startDate, LocalDate endDate);
	
	List<Patient> findByNameContaining(String query);
	List<Patient> findByNameContainingOrderByIdDesc(String query);
	
	//own custom query JPQL or SQL
	//find user who have specific blood group
	
	@Query("select p from Patient p where p.bloodGroup = ?1") //you need to inject as parameter then use @Param
	List<Patient> findByBloodGroup(@Param("bloodGroup") BloodGroupType bloodGroup);
	
	
	
}
