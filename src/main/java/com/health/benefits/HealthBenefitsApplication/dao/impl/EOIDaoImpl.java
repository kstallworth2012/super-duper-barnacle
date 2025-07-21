package com.health.benefits.HealthBenefitsApplication.dao.impl;



import com.health.benefits.HealthBenefitsApplication.dao.EOIDao;
import org.springframework.jdbc.core.JdbcTemplate;




public class EOIDaoImpl implements EOIDao{

					private JdbcTemplate jdbcTemplate;
					public EOIDaoImpl(JdbcTemplate _jdbcTemplate){
						this.jdbcTemplate = _jdbcTemplate;

				}

}
