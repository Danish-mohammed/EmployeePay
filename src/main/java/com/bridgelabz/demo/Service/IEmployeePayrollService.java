package com.bridgelabz.demo.Service;

import java.util.List;
import java.util.Optional;

import com.bridgelabz.demo.dto.EmployeePayrollDTO;
import com.bridgelabz.demo.model.EmployeePayrollData;
public interface IEmployeePayrollService {
	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollDataById(int employeeId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

	EmployeePayrollData updateEmployeePayrollData(int employeeId,EmployeePayrollDTO employeePayrollDTO);

	void deleteEmployeePayrollData(int employeeId);
    List<EmployeePayrollData> getEmployeesPayrollDataByDepartment(String department);
    List<EmployeePayrollData> getEmployeesPayrollDataByGender(String gender);

    String deleteallEmployeePayrollData();

    List<EmployeePayrollData> getAllEmployeePayrollData(String token);

    Optional<EmployeePayrollData> getupdateEmployeePayrollData(String token);

    String deleteAllEmployeePayrollData();

}
