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
eob_id: A unique identifier for the EOB record.
claim_id: The ID of the original healthcare claim.
insurance_policy_id: A foreign key linking to the InsurancePolicy entity.
patient_id: A foreign key linking to the Patient entity (the covered employee or dependent).
provider_name: The name of the healthcare provider who rendered the service.
service_date: The date the service was provided.
billed_amount: The total amount the provider charged for the service.
allowed_amount: The amount the insurance company is willing to pay for the service.
paid_by_insurer: The amount the insurance company paid to the provider.
patient_responsibility_amount: The total amount the patient owes, which can include the deductible, copay, or coinsurance.
status: The current state of the EOB (e.g., processed, denied).
creation_date: The date the EOB record was created.
remarks: Codes or notes from the health plan explaining cost adjustments or payment details. 
	 */
	
	
}
