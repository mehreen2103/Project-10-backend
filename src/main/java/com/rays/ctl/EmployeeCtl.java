package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.EmployeeDTO;
import com.rays.form.EmployeeForm;
import com.rays.service.EmployeeServiceInt;

@RestController
@RequestMapping(value ="Employee")
public class EmployeeCtl extends BaseCtl<EmployeeForm, EmployeeDTO, EmployeeServiceInt>{
	
	@GetMapping("/preload")
	public ORSResponse preload(){
		
		ORSResponse res = new ORSResponse(true);
		
		return res;
		
	}

}
