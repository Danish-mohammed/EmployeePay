package com.bridgelabz.demo.dto;

import java.util.List;

import com.bridgelabz.demo.model.EmployeePayrollData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
	
	private String message;
	private Object data;
	
	public ResponseDTO(String message,Object data) {
        this.message = message;
        this.data = data;
    }
}
