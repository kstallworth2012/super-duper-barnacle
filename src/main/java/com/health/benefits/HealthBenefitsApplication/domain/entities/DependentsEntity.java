package com.health.benefits.HealthBenefitsApplication.domain.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
	Long dependent_id;
	String name; 
	@Enumerated(EnumType.STRING)
	DependentRelationship relationship;
	String date_of_birth;
	String gender;
	String ssn;
	Boolean eligible;
} 