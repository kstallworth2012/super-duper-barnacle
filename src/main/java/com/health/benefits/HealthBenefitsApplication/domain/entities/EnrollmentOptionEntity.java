package com.health.benefits.HealthBenefitsApplication.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import com.health.benefits.HealthBenefitsApplication.enums.OptionNameType;
import com.health.benefits.HealthBenefitsApplication.enums.BenefitTier;
import com.health.benefits.HealthBenefitsApplication.enums.CoverageType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
//This entity represents the available choices for 
//employees during enrollment, 
//linking a BenefitPlan with its specific costs.


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "enrollmentOptions") 
public class EnrollmentOptionEntity {


 @Id
 private String EnrollmentOptionID;
 private Double MonthlyCost;
 private String ProviderName;
 @Enumerated(EnumType.STRING)
 private OptionNameType;

 @Enumerated(EnumType.STRING)
 private BenefitTier;
 @Enumerated(EnumType.STRING)
 private CoverageType
/* 
 *
 EnrollmentOptionID (Primary Key)
OptionName (e.g., Blue Cross PPO, High Deductible Plan)
enum CoverageType (e.g., Medical, Dental, Vision)
Enum Tier (e.g., Self-Only, Self + Spouse, Self + Family)
private Double MonthlyCost (per tier)
private String ProviderName 
*/
}
