package com.health.benefits.HealthBenefitsApplication.domain.dto;

import com.health.benefits.HealthBenefitsApplication.enums.DependentRelationship;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DependentsDTO {
	
	Long dependent_id;
	String name; 
	@Enumerated(EnumType.STRING)
	DependentRelationship relationship;
	String date_of_birth;
	String gender;
	String ssn;
	Boolean eligible;


}
