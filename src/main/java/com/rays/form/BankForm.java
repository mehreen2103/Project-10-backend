package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BankDTO;

public class BankForm extends BaseForm {

    @NotEmpty(message = "Please enter Bank Name")
    private String bankName;

    @NotEmpty(message = "Please enter Branch Name")
    private String branchName;

    @NotEmpty(message = "Please enter IFSC Code")
    private String ifscCode;

    @NotEmpty(message = "Please enter City")
    private String city;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public BaseDTO getDto() {
        BankDTO dto = new BankDTO();
        dto.setId(id);
        dto.setBankName(bankName);
        dto.setBranchName(branchName);
        dto.setIfscCode(ifscCode);
        dto.setCity(city);
        return dto;
    }
}