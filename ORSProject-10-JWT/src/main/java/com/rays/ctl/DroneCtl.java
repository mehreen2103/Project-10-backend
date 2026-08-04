package com.rays.ctl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.DroneDTO;
import com.rays.form.DroneForm;
import com.rays.service.DroneServiceInt;

@RestController
@RequestMapping(value = "Drone")
public class DroneCtl extends BaseCtl<DroneForm, DroneDTO, DroneServiceInt>{

	
	@GetMapping("preload")
	public ORSResponse preload() {
		
		ORSResponse res = new ORSResponse(true);
		
		List<DropdownList> statusList = new ArrayList();
		
		res.addResult("statusList", statusList);
		
		return res;
	}
}
