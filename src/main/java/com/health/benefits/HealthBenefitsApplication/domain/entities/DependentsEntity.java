package com.health.benefits.HealthBenefitsApplication.domain.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import com.health.benefits.HealthBenefitsApplication.enums.DependentRelationship;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "dependents")
public class DependentsEntity{

	@Id
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
	
	
	
	
	
	
} 