package com.health.benefits.HealthBenefitsApplication.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.TestDataUtil;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class CarrierControllerIntegrationTests {

	
	private MockMvc mockMVC;
	private ObjectMapper objectMapper;

	@Autowired
	public CarrierControllerIntegrationTests(MockMvc mockMVC) {
		this.mockMVC = mockMVC;
		this.objectMapper = new ObjectMapper();
	}
	
	@Test
	public void testThatCreateCarrierSuccessfullyReturnsHttp201Create() {
		CarrierEntity testCarrierA = TestDataUtil.createTestCarrierEntityA();
		try {
        String carrierJson;
		
			carrierJson = objectMapper.writeValueAsString(testCarrierA);
	
		
			mockMVC.perform(
							MockMvcRequestBuilders.post("/new-carriers")
									.contentType(MediaType.APPLICATION_JSON)
									.content(carrierJson)
						).andExpect(
				                MockMvcResultMatchers.jsonPath("$.name").value("hif5"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
