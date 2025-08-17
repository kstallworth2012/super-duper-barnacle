package com.health.benefits.HealthBenefitsApplication.domain.entities;




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "carrier") 
public class CarrierEntity{

		@Id
//		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carrier_id_seq")
		private Long carrier_id;
		
		private String name;
		private String contact;
		private Boolean edi_support;
		private String api_endpoint;
}