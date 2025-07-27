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
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

//issue how do you persist enums 
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "healthbenefitplan") 
public class HealthBenefitPlanEntity{

				@Id
				private String plan_id; 
				private String plan_type; 
				private String carrier;
				@Enumerated(EnumType.STRING)
				private CoverageLE coverage;
				private LocalDate effective_date;
				private LocalDate end_date; 
				private Double premium_an;
				private Double employer_copay;
				@Enumerated(EnumType.STRING)
				private NetworkType network_type;


}
