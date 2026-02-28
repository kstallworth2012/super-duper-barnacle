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
import java.util.UUID;

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
			private UUID deduction_id;
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
			
			
			public Double getDeduction_amount() {
				return deduction_amount;
			}
			public void setDeduction_amount(Double deduction_amount) {
				this.deduction_amount = deduction_amount;
			}
			public DeductionFrequency getFrequency() {
				return frequency;
			}
			public void setFrequency(DeductionFrequency frequency) {
				this.frequency = frequency;
			}
			public UUID getDeduction_id() {
				return deduction_id;
			}
			public void setDeduction_id(UUID deduction_id) {
				this.deduction_id = deduction_id;
			}
			public EmployeeEntity getEmp_id() {
				return emp_id;
			}
			public void setEmp_id(EmployeeEntity emp_id) {
				this.emp_id = emp_id;
			} 
			
			
}
