

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
package com.health.benefits.HealthBenefitsApplication.config;

import javax.sql.DataSource;

@Configuration
public class HealthBenefitsConfig{
	
	@Bean
	public JdbcTemplate jdbcTemplate(final DataSource dataSource){
			return new JdbcTemplate(dataSource);
	}

}
