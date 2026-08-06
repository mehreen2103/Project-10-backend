package com.rays.ctl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.WeatherDTO;
import com.rays.form.WeatherForm;
import com.rays.service.WeatherServiceInt;

@RestController
@RequestMapping(value = "Weather")
public class WeatherCtl extends BaseCtl<WeatherForm, WeatherDTO, WeatherServiceInt>{

	@GetMapping("preload")
	public ORSResponse preload() {

	    ORSResponse res = new ORSResponse(true);

	    List<DropdownList> statusList = new ArrayList<>();

	    res.addResult("statusList", statusList);

	    return res;
	}
}
