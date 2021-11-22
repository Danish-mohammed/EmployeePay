package com.bridgelabz.demo.Service;

import java.util.List;
import com.bridgelabz.demo.dto.EmployeePayrollDTO;
import com.bridgelabz.demo.model.EmployeePayrollData;
public interface IEmployeePayrollService {
	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollDataById(int employeeId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

	EmployeePayrollData updateEmployeePayrollData(int employeeId,EmployeePayrollDTO employeePayrollDTO);

	void deleteEmployeePayrollData(int employeeId);
}
