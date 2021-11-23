package com.bridgelabz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class EmployeePayrollApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Payroll App");
		SpringApplication.run(EmployeePayrollApplication.class, args);
		log.info("Employee Payroll App started");
	}

}