package com.health.benefits.HealthBenefitsApplication.dao.impl;




import com.health.benefits.HealthBenefitsApplication.dao.CarrierDao;
import org.springframework.jdbc.core.JdbcTemplate;


public class CarrierDaoImpl implements CarrierDao{

				private JdbcTemplate jdbcTemplate;



				public CarrierDaoImpl(JdbcTemplate _jdbcTemplate){
						this.jdbcTemplate = _jdbcTemplate;

				}

}
