package com.health.benefits.HealthBenefitsApplication.domain.entities;
/*
 * 
 * This entity is used to track and display claims submitted to the insurance provider, 
 * including status and payment information. 
 */

import java.time.LocalDateTime;

import com.health.benefits.HealthBenefitsApplication.enums.ClaimStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "claims") 
public class ClaimEntity {
	
	
	@Id
	private Long claim_id;
	@ManyToOne
	@JoinColumn()
	private EmployeeEntity employee_id;
	
	// OPTIONAL private DependentsEntity dependent_id;
	
	@Enumerated(EnumType.STRING)
	private ClaimStatus claim_status;
	
	private LocalDateTime submissionDate;
	private LocalDateTime serviceDate;
	private Double amountBilled;
	private Double amountPaid;
	private String ExplanationOfBenefits;
	

}
