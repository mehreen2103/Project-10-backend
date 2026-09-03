package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_bank")
public class BankDTO extends BaseDTO {

    @Column(name = "bank_name", length = 100)
    private String bankName;

    @Column(name = "branch_name", length = 100)
    private String branchName;

    @Column(name = "ifsc_code", length = 50)
    private String ifscCode;

    @Column(name = "city", length = 100)
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
    public String getValue() {
        return bankName;
    }

    @Override
    public String getUniqueKey() {
        return "bankName";
    }

    @Override
    public String getUniqueValue() {
        return bankName;
    }

    @Override
    public String getLabel() {
        return "Bank";
    }

    @Override
    public String getTableName() {
        return "bank";
    }
}