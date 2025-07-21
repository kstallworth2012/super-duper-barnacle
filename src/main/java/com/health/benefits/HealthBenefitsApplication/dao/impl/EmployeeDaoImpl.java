package com.health.benefits.HealthBenefitsApplication.dao.impl;


import com.health.benefits.HealthBenefitsApplication.dao.EmployeeDao;
import org.springframework.jdbc.core.JdbcTemplate;





public class EmployeeDaoImpl implements EmployeeDao{

					private JdbcTemplate jdbcTemplate;
					
		public EmployeeDaoImpl(JdbcTemplate _jdbcTemplate){
						this.jdbcTemplate = _jdbcTemplate;

				}
}