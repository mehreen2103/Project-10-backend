package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ATMDTO;
import com.rays.form.ATMForm;
import com.rays.service.ATMServiceInt;

@RestController
@RequestMapping(value = "Atm")
public class ATMCtl extends BaseCtl<ATMForm, ATMDTO, ATMServiceInt>{

}
