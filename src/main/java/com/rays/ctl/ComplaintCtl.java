package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ComplaintDTO;
import com.rays.form.ComplaintForm;
import com.rays.service.ComplaintServiceInt;

@RestController
@RequestMapping(value = "Complaint")
public class ComplaintCtl extends BaseCtl<ComplaintForm, ComplaintDTO, ComplaintServiceInt>{
	
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		
		ORSResponse res = new ORSResponse();
		
		return res;
		
	}

}
