package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_vendor")
public class VendorDTO extends BaseDTO {

    @Column(name = "vendor_name", length = 100)
    private String vendorName;

    @Column(name = "mobile_no", length = 15)
    private String mobileNo;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "service_type", length = 100)
    private String serviceType;

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String getValue() {
        return vendorName;
    }

    @Override
    public String getUniqueKey() {
        return "vendorName";
    }

    @Override
    public String getUniqueValue() {
        return vendorName;
    }

    @Override
    public String getLabel() {
        return "Vendor";
    }

    @Override
    public String getTableName() {
        return "vendor";
    }
}