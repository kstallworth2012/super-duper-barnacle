package com.health.benefits.HealthBenefitsApplication.domain.entities;




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "carrier") 
public class CarrierEntity{

		@Id
		private String carrier_id;
		private String name;
		private String contact;
		private Boolean edi_support;
		private String api_endpoint;
}