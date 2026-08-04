package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ScholarshipDTO;
import com.rays.form.ScholarshipForm;
import com.rays.service.ScholarshipServiceInt;

@RestController
@RequestMapping(value = "Scholarship")
public class ScholarshipCtl extends BaseCtl<ScholarshipForm, ScholarshipDTO, ScholarshipServiceInt> {
	
	@GetMapping("/preload")
	public ORSResponse preload() {

	    ORSResponse res = new ORSResponse(true);

	    return res;
	}

}
