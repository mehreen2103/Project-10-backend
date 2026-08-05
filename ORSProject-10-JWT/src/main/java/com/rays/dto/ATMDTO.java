package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_atm")
public class ATMDTO extends BaseDTO {

    @Column(name = "location", length = 100)
    private String location;

    @Column(name = "bank_name", length = 100)
    private String bankName;

    @Column(name = "cash_available", length = 50)
    private String cashAvailable;

    @Column(name = "status", length = 50)
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
    public String getValue() {
        return location;
    }

    @Override
    public String getUniqueKey() {
        return "location";
    }

    @Override
    public String getUniqueValue() {
        return location;
    }

    @Override
    public String getLabel() {
        return "ATM";
    }

    @Override
    public String getTableName() {
        return "atm";
    }
}