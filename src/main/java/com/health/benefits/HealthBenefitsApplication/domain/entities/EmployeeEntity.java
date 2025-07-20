package com.health.benefits.HealthBenefitsApplication.domain.entities;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.health.benefits.HealthBenefitsApplication.enums.CoverageLE;
import com.health.benefits.HealthBenefitsApplication.enums.NetworkType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeEntity{





private String plan_id; 
private String plan_type; 
private String carrier;
private CoverageLE coverage;
private LocalDate effective_date;
private LocalDate end_date; 
private Double premium_an;
private Double employer_copay; 
private NetworkType network_type;
}


