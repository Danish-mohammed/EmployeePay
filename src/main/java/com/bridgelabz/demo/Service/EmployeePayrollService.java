package com.bridgelabz.demo.Service;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.bridgelabz.demo.dto.EmployeePayrollDTO;
import com.bridgelabz.demo.model.EmployeePayrollData;
import com.bridgelabz.demo.Exceptions.EmployeePayrollException;
import org.springframework.beans.factory.annotation.Autowired;
import com.bridgelabz.demo.repository.EmployeePayrollRepository;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService {

	@Autowired
    private EmployeePayrollRepository employeePayrollRepository;
	
	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return employeePayrollRepository.findAll();
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int employeeId) {
		return employeePayrollRepository.findById(employeeId)
                .orElseThrow(() -> new EmployeePayrollException("Employee with EmployeeId" + employeeId
                        + " Doesn't Exists...!"));
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(empPayrollDTO);
        log.debug("Employee Data: " + empData.toString());
        return employeePayrollRepository.save(empData);
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int employeeId, EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = this.getEmployeePayrollDataById(employeeId);
		empData.updateEmployeePayollData(empPayrollDTO);
        return employeePayrollRepository.save(empData);
	}

	@Override
	public void deleteEmployeePayrollData(int employeeId) {
		 EmployeePayrollData empData = this.getEmployeePayrollDataById(employeeId);
	        employeePayrollRepository.delete(empData);
	}

}
