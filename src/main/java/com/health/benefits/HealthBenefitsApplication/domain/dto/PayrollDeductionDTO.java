package com.health.benefits.HealthBenefitsApplication.domain.dto;

import java.time.LocalDate;
import java.util.UUID;

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


	private UUID deduction_id;
	private EmployeeEntity emp_id;
	private HealthBenefitPlanEntity plan_id;
	private Double deduction_amount;
	@Enumerated(EnumType.STRING)
	private DeductionFrequency frequency;
	private LocalDate start_date;
	private LocalDate end_date;
	
	
	
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
	public HealthBenefitPlanEntity getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(HealthBenefitPlanEntity plan_id) {
		this.plan_id = plan_id;
	}
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
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	} 
	
	
	
	
	
}
