package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InsuranceDTO;

public class InsuranceForm extends BaseForm {

    @NotEmpty(message = "Please enter Policy Holder Name")
    private String policyHolderName;

    @NotEmpty(message = "Please enter Policy Type")
    private String policyType;

    @NotEmpty(message = "Please enter Premium Amount")
    private String premiumAmount;

    @NotNull(message = "Please select Expiry Date")
    private Date expiryDate;

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(String premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public BaseDTO getDto() {

        InsuranceDTO dto = new InsuranceDTO();

        dto.setId(id);
        dto.setPolicyHolderName(policyHolderName);
        dto.setPolicyType(policyType);
        dto.setPremiumAmount(premiumAmount);
        dto.setExpiryDate(expiryDate);

        return dto;
    }
}