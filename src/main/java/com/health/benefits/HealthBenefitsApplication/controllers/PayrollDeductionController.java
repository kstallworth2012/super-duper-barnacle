package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.health.benefits.HealthBenefitsApplication.domain.dto.PayrollDeductionDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.PayrollDeductionEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;
import com.health.benefits.HealthBenefitsApplication.repositories.PayrollDeductionRepository;
import com.health.benefits.HealthBenefitsApplication.services.PayrollDeductionService;


@RestController
@RequestMapping("/api/payroll-deductions")
public class PayrollDeductionController{


	  private PayrollDeductionService payrollDeductionService;
	  private Mapper<PayrollDeductionEntity, PayrollDeductionDTO> payrollDeductionMapper;

	  
	  
	  
    public PayrollDeductionController(PayrollDeductionService payrollDeductionService,
			Mapper<PayrollDeductionEntity, PayrollDeductionDTO> payrollDeductionMapper) {
		this.payrollDeductionService = payrollDeductionService;
		this.payrollDeductionMapper = payrollDeductionMapper;
	}
    
    
    @PostMapping(path="/new-payroll-deduction")
	public ResponseEntity<PayrollDeductionDTO> createPayrollDeduction(@RequestBody PayrollDeductionDTO _app) {
			PayrollDeductionEntity payrollDeductionEntity = payrollDeductionMapper.mapFrom(_app);
			PayrollDeductionEntity savedPayrollDeductionEntity = payrollDeductionService.createPayrollDeduction(null, payrollDeductionEntity);
			
			return new ResponseEntity<>(payrollDeductionMapper.mapTo(savedPayrollDeductionEntity), HttpStatus.CREATED);
	}
    
    
    

	// Read All
    @GetMapping(path="/")
    public List<PayrollDeductionDTO> getAllPayrollDeductions() {
    	List<PayrollDeductionEntity> payrollDeductions = payrollDeductionService.findAll();
    	return payrollDeductions.stream().map(payrollDeductionMapper::mapTo).collect(Collectors.toList());
    }
    
    
    
    
    	//PAGEABLE
	@GetMapping(path="/")
	public Page<PayrollDeductionDTO> listPayrollDeductions(Pageable page){
		Page<PayrollDeductionEntity> payrollDeductions = payrollDeductionService.findAll(page);
		return payrollDeductions.map(payrollDeductionMapper::mapTo);
	}
    

    // Read One
    @GetMapping("/{deduction_id}")
    public ResponseEntity<PayrollDeductionDTO> getPayrollDeductionById(@PathVariable("deduction_id") String id) {
       Optional<PayrollDeductionEntity> foundPayrollDeduction = payrollDeductionService.findOne(id);
 	    return foundPayrollDeduction.map(payrollDeductionEntity ->{
	    	PayrollDeductionDTO payrollDeductionDTO = payrollDeductionMapper.mapTo(payrollDeductionEntity);
		 return new ResponseEntity<>(payrollDeductionDTO, HttpStatus.OK);
	 
	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
   
    }
    
    

@PutMapping(path="/{id}")
public ResponseEntity<PayrollDeductionDTO> fullUpdatePayrollDeduction(@PathVariable("id") String id, @RequestBody PayrollDeductionDTO payrollDto){
	
	if(!payrollDeductionService.isExists(id)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	payrollDto.setId(id);
	PayrollDeductionEntity payrollDeductionEntity = payrollDeductionMapper.mapFrom(payrollDto);
	PayrollDeductionEntity savedPayrollDeductionEntity = payrollDeductionService.save(payrollDeductionEntity);
	
	return new ResponseEntity<>(payrollDeductionMapper.mapTo(savedPayrollDeductionEntity), HttpStatus.OK); 
	
}	

    
    
    
    	

@PatchMapping(path ="{/id}")
public ResponseEntity<PayrollDeductionDTO> partialUpdate(@PathVariable("id") String id, @RequestBody PayrollDeductionDTO payrollDeductionDto){
	
	if(!payrollDeductionService.isExists(id)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	PayrollDeductionEntity payrollDeductionEntity = payrollDeductionMapper.mapFrom(payrollDeductionDto);
	PayrollDeductionEntity updatedPayrollDeduction = payrollDeductionService.partialUpdate(id, payrollDeductionEntity);
	
	return new ResponseEntity<>(payrollDeductionMapper.mapTo(updatedPayrollDeduction), HttpStatus.OK);
	
	
	
}
    
    
    
    
    
    
    
	@DeleteMapping(path="/{id}")
	public ResponseEntity<PayrollDeductionDTO> deletePayrollDeduction(@PathVariable("id") String id) {
		
		payrollDeductionService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}