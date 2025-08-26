package com.springBoot.Hospital.dto;

import com.springBoot.Hospital.Entity.Type.BloodGroupType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BloodGroupCountResponseEntity {

	private BloodGroupType bloodGroupType;
	private Long count;
	
	
}
