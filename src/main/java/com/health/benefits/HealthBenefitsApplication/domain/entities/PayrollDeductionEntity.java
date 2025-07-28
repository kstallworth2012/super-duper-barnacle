package com.health.benefits.HealthBenefitsApplication.domain.entities;


import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.enums.DeductionFrequency;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.CascadeType;
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
@Entity
@Table(name = "payrolldeductions")
public class PayrollDeductionEntity{


			@Id
			private String deduction_id;
			@OneToOne(cascade = CascadeType.ALL)
			@JoinColumn
			private EmployeeEntity emp_id;
			@OneToOne(cascade = CascadeType.ALL)
			@JoinColumn
			private HealthBenefitPlanEntity plan_id;
			private Double deduction_amount;
			@Enumerated(EnumType.STRING)
			private DeductionFrequency frequency;
			private LocalDate start_date;
			private LocalDate end_date; 
}
