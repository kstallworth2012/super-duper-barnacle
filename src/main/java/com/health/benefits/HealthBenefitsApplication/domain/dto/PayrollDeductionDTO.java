package com.health.benefits.HealthBenefitsApplication.domain.dto;

import java.time.LocalDate;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.enums.DeductionFrequency;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PayrollDeductionDTO {


	private String deduction_id;
	private EmployeeEntity emp_id;
	private HealthBenefitPlanEntity plan_id;
	private Double deduction_amount;
	@Enumerated(EnumType.STRING)
	private DeductionFrequency frequency;
	private LocalDate start_date;
	private LocalDate end_date; 
}
