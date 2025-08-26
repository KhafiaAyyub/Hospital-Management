package com.springBoot.Hospital.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Indexed;

import com.springBoot.Hospital.Entity.Type.BloodGroupType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@Table (
		name = "patient_tbl",
		uniqueConstraints = {
				@UniqueConstraint(name = "unique_patient_email", columnNames = {"email"}),
				@UniqueConstraint(name = "unique_patient_name_birthdate", columnNames = {"name","birthDate"})
		},
		indexes = {
				@Index(name = "idx_patient_birth_date", columnList = "birthDate")
		}
		
		)
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
//	@Column(name = "patient_name" , nullable = false, length = 40) //new table will be create but other table still be there 
	
	private String name;
	
	@ToString.Exclude
	private LocalDate birthDate;
	
	@Column(unique = true)
	private String email;
	
	private String gender;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime createdAt;
	
	@Enumerated(EnumType.STRING)
	private BloodGroupType bloodGroup;
}
