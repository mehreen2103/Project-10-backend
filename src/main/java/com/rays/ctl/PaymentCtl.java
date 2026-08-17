package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PaymentDTO;
import com.rays.form.PaymentForm;
import com.rays.service.PaymentServiceInt;

@RestController
@RequestMapping(value = "Payment")
public class PaymentCtl extends BaseCtl<PaymentForm, PaymentDTO, PaymentServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);

		return res;
	}

}
