package com.bridgelabz.demo.Controller;

import com.bridgelabz.demo.dto.EmployeePayrollDTO;
import com.bridgelabz.demo.dto.ResponseDTO;
import com.bridgelabz.demo.model.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.bridgelabz.demo.Service.IEmployeePayrollService;
import java.util.List;


@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {
	 @Autowired
	 private IEmployeePayrollService employeePayrollService;
	 
	@RequestMapping(value= {"","/","get"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
		List<EmployeePayrollData> empDataList =null;
		empDataList =employeePayrollService.getEmployeePayrollData();
		ResponseDTO responseDTO = new ResponseDTO("Get Call Success",empDataList);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{employeeId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("employeeId") int employeeId){
		EmployeePayrollData payrollData=null;
		payrollData=employeePayrollService.getEmployeePayrollDataById(employeeId);
		ResponseDTO responseDTO = new ResponseDTO("Get Call Success for id:", payrollData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData payrollData=null;
		payrollData=employeePayrollService.createEmployeePayrollData(employeePayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Created Employee payroll data for:", payrollData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update/{employeeId}")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("employeeId") int employeeId,@RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData payrollData=null;
		payrollData=employeePayrollService.updateEmployeePayrollData(employeeId,employeePayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated Employee payroll Data for: ", payrollData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{employeeId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("employeeId") int employeeId){
		employeePayrollService.deleteEmployeePayrollData(employeeId);
		ResponseDTO responseDTO = new ResponseDTO("Delete Call Success for id: ", "employeeId "+employeeId);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
}