package com.health.benefits.HealthBenefitsApplication.domain.entities;
/*
 * ExplanationOfBenefits (EOB) entity
This entity captures the detailed summary of how a medical claim was paid 
by the insurance company. In a self-service portal, employees can access their 
EOBs to understand what their insurer 
paid for a healthcare service and what they may owe. 
 */
public class ExplanationOfBenefitsEntity {

	
	/*
				 * Key attributes of the EOB entity
			private Long eob_id: A unique identifier for the EOB record.
			private ClaimEntity claim_id: The ID of the original healthcare claim.
			private InsurancePolicyEntity insurance_policy_id: A foreign key linking to the InsurancePolicy entity.
			private EmployeeEntity patient_id: A foreign key linking to the Patient entity (the covered employee or dependent).
			private HealthcareProvider provider_name: The name of the healthcare provider who rendered the service.
			private LocalDateTime service_date: The date the service was provided.
			private Double billed_amount: The total amount the provider charged for the service.
			private Double allowed_amount: The amount the insurance company is willing to pay for the service.
			private Double paid_by_insurer: The amount the insurance company paid to the provider.
			private Double patient_responsibility_amount: The total amount the patient owes, which can include the deductible, copay, or coinsurance.
			private ClaimStatus status: The current state of the EOB (e.g., processed, denied).
			private LocalDateTime creation_date: The date the EOB record was created.
			private String remarks: Codes or notes from the health plan explaining cost adjustments or payment details. 
	 */
	
	
}
