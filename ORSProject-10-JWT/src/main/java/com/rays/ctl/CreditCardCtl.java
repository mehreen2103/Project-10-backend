package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CreditCardDTO;
import com.rays.form.CreditCardForm;
import com.rays.service.CreditCardServiceInt;

@RestController
@RequestMapping(value = "Creditcard")
public class CreditCardCtl extends BaseCtl<CreditCardForm, CreditCardDTO, CreditCardServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {

        ORSResponse res = new ORSResponse(true);

        return res;
    }
}