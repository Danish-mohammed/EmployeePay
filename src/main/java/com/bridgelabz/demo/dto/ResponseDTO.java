package com.bridgelabz.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
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
