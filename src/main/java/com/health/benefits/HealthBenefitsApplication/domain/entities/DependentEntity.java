package com.health.benefits.HealthBenefitsApplication.domain.entities;



import com.health.benefits.HealthBenefitsApplication.enums.DependentRelationship;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "dependents") 
public class DependentEntity{

	@Id
	private String dependent_id; 
	private String name;
	private DependentRelationship relationship;
	private LocalDate date_of_birth;
	private String gender;
	private String ssn;
	private Boolean eligible;
}