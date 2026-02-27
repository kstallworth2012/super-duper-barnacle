package com.health.benefits.HealthBenefitsApplication.domain.dto;

import java.time.LocalDate;
import java.util.UUID;

import com.health.benefits.HealthBenefitsApplication.enums.CoverageLE;
import com.health.benefits.HealthBenefitsApplication.enums.NetworkType;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {

	
	
	private UUID emp_id;
	private String plan_id; 
	private String plan_type; 
	private String carrier; // should be Carrier entity
	@Enumerated(EnumType.STRING)
	private CoverageLE coverage;
	 private LocalDate effective_date;
	 private LocalDate end_date; 
	 private Double premium_an;
	 private Double employer_copay; 
	 @Enumerated(EnumType.STRING)
	 private NetworkType network_type;
	public UUID getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(UUID emp_id) {
		this.emp_id = emp_id;
	}
	public String getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	public String getPlan_type() {
		return plan_type;
	}
	public void setPlan_type(String plan_type) {
		this.plan_type = plan_type;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public CoverageLE getCoverage() {
		return coverage;
	}
	public void setCoverage(CoverageLE coverage) {
		this.coverage = coverage;
	}
	public LocalDate getEffective_date() {
		return effective_date;
	}
	public void setEffective_date(LocalDate effective_date) {
		this.effective_date = effective_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	public Double getPremium_an() {
		return premium_an;
	}
	public void setPremium_an(Double premium_an) {
		this.premium_an = premium_an;
	}
	public Double getEmployer_copay() {
		return employer_copay;
	}
	public void setEmployer_copay(Double employer_copay) {
		this.employer_copay = employer_copay;
	}
	public NetworkType getNetwork_type() {
		return network_type;
	}
	public void setNetwork_type(NetworkType network_type) {
		this.network_type = network_type;
	}
	 
	 
	 
	 
	 
	 
}
