package com.health.benefits.HealthBenefitsApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class HealthBenefitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthBenefitsApplication.class, args);
//		 CarrierEntity carrier = CarrierEntity.builder().carrier_id("hif5").build();

		 System.out.println("===========HealthBenefitsApplication=====================");
	}

}
