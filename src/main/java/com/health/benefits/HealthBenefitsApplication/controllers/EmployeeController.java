package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.EmployeeRepository;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController{


  private Service Service;
  private Mapper<Entity, DTO> Mapper;

    // Read All
    @GetMapping
    public Iterable<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable Long id) {
        return employeeRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}