package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.LaptopDTO;
import com.rays.form.LaptopForm;
import com.rays.service.LaptopServiceInt;

@RestController
@RequestMapping(value = "Laptop")
public class LaptopCtl extends BaseCtl<LaptopForm, LaptopDTO, LaptopServiceInt>{
	
	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);

		return res;
	}

}
