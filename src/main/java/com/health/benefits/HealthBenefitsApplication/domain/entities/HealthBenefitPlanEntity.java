package com.health.benefits.HealthBenefitsApplication.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.health.benefits.HealthBenefitsApplication.enums.NetworkType;
import com.health.benefits.HealthBenefitsApplication.enums.CoverageLE;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HealthBenefitPlanEntity{


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
