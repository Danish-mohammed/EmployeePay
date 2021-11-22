package com.bridgelabz.demo.Service;

import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.demo.dto.EmployeePayrollDTO;
import com.bridgelabz.demo.model.EmployeePayrollData;

public class EmployeePayrollService implements IEmployeePayrollService{

	 @Override
	    public List<EmployeePayrollData> getEmployeePayrollData() {
	        List<EmployeePayrollData> empDataList = new ArrayList<>();
	        empDataList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("Sachin", 55000)));
	        return empDataList;
	    }

	    @Override
	    public EmployeePayrollData getEmployeePayrollDataById(int employeeId) {
	       EmployeePayrollData empData = null;
	       empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Dravid",28000));
	        return empData;
	    }

	    @Override
	    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
	        EmployeePayrollData empData = null;
	        empData = new EmployeePayrollData(1,empPayrollDTO);
	        return empData;
	    }

	    @Override
	    public EmployeePayrollData updateEmployeePayrollData(int employeeId, EmployeePayrollDTO empPayrollDTO) {
	        EmployeePayrollData empData = null;
	        empData = new EmployeePayrollData(1,empPayrollDTO);
	        return empData;
	    }

	    @Override
	    public void deleteEmployeePayrollData(int employeeId) {

	    }

}
