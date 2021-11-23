package com.bridgelabz.demo.repository;

import com.bridgelabz.demo.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

}
