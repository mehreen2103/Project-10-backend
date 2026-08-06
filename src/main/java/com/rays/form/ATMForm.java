package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ATMDTO;

public class ATMForm extends BaseForm {

    @NotEmpty(message = "Please enter Location")
    private String location;

    @NotEmpty(message = "Please enter Bank Name")
    private String bankName;

    @NotEmpty(message = "Please enter Cash Available")
    private String cashAvailable;

    @NotEmpty(message = "Please enter Status")
    private String status;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCashAvailable() {
        return cashAvailable;
    }

    public void setCashAvailable(String cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public BaseDTO getDto() {

        ATMDTO dto = new ATMDTO();

        dto.setId(id);
        dto.setLocation(location);
        dto.setBankName(bankName);
        dto.setCashAvailable(cashAvailable);
        dto.setStatus(status);

        return dto;
    }
}