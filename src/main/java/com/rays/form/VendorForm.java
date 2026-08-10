package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VendorDTO;

public class VendorForm extends BaseForm {

    @NotEmpty(message = "Please enter Vendor Name")
    private String vendorName;

    @NotEmpty(message = "Please enter Mobile Number")
    private String mobileNo;

    @NotEmpty(message = "Please enter Address")
    private String address;

    @NotEmpty(message = "Please enter Service Type")
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
    public BaseDTO getDto() {

        VendorDTO dto = new VendorDTO();

        dto.setId(id);
        dto.setVendorName(vendorName);
        dto.setMobileNo(mobileNo);
        dto.setAddress(address);
        dto.setServiceType(serviceType);

        return dto;
    }
}