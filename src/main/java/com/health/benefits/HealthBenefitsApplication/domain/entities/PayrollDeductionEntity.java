package com.health.benefits.HealthBenefitsApplication.domain.entities;


import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.enums.DeductionFrequency;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PayrollDeductionEntity{



			private String deduction_id;
			private EmployeeEntity emp_id;
			private HealthBenefitPlanEntity plan_id;
			private Double deduction_amount;
			private DeductionFrequency frequency;
			private LocalDate start_date;
			private LocalDate end_date; 
}
