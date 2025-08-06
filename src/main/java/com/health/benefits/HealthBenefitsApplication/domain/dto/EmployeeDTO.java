package com.health.benefits.HealthBenefitsApplication.domain.dto;

import java.time.LocalDate;

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

	
	
	private Long emp_id;
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
}
