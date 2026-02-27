package com.health.benefits.HealthBenefitsApplication.domain.dto;

import java.util.UUID;

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
	
	UUID dependent_id;
	String name; 
	@Enumerated(EnumType.STRING)
	DependentRelationship relationship;
	String date_of_birth;
	String gender;
	String ssn;
	Boolean eligible;
	public UUID getDependent_id() {
		return dependent_id;
	}
	public void setDependent_id(UUID dependent_id) {
		this.dependent_id = dependent_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DependentRelationship getRelationship() {
		return relationship;
	}
	public void setRelationship(DependentRelationship relationship) {
		this.relationship = relationship;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Boolean getEligible() {
		return eligible;
	}
	public void setEligible(Boolean eligible) {
		this.eligible = eligible;
	}

	

}
