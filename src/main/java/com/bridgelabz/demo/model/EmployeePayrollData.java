package com.bridgelabz.demo.model;

import com.bridgelabz.demo.dto.EmployeePayrollDTO;
import lombok.Data;

public @Data class EmployeePayrollData {
	private int employeeId;
	private String name;
	private long salary;
	
	public EmployeePayrollData() {
	
	}
	public EmployeePayrollData(int employeeId, String name, long salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.employeeId = employeeId;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
	}
	
}
