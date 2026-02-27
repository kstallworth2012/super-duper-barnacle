package com.health.benefits.HealthBenefitsApplication.domain.dto;

import java.util.UUID;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.enums.EOD_Status;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EoiDTO {

	
	
	
	private UUID eod_id;
	private EmployeeEntity emp_id;
	private HealthBenefitPlanEntity plan_id;
	private EOD_Status status;
	private String DocumentArr;
	public UUID getEod_id() {
		return eod_id;
	}
	public void setEod_id(UUID eod_id) {
		this.eod_id = eod_id;
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
	public EOD_Status getStatus() {
		return status;
	}
	public void setStatus(EOD_Status status) {
		this.status = status;
	}
	public String getDocumentArr() {
		return DocumentArr;
	}
	public void setDocumentArr(String documentArr) {
		DocumentArr = documentArr;
	}
	
	
	
	
	
}
