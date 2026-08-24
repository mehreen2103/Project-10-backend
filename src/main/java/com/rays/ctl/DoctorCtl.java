package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.DoctorDTO;
import com.rays.form.DoctorForm;
import com.rays.service.DoctorServiceInt;

@RestController
@RequestMapping(value = "Doctor")
public class DoctorCtl extends BaseCtl<DoctorForm, DoctorDTO, DoctorServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		
		ORSResponse res = new ORSResponse(true);
		
		return res;
		
	}
}
