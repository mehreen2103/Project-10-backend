package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ComplaintDTO;

public class ComplaintForm extends BaseForm {

    @NotEmpty(message = "Please enter Complaint Type")
    private String complaintType;

    @NotEmpty(message = "Please enter Description")
    private String description;

    @NotNull(message = "Please enter Complaint Date")
    private Date complaintDate;

    @NotEmpty(message = "Please enter Status")
    private String status;

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getComplaintDate() {
        return complaintDate;
    }

    public void setComplaintDate(Date complaintDate) {
        this.complaintDate = complaintDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public BaseDTO getDto() {
        ComplaintDTO dto = new ComplaintDTO();
        dto.setId(id);
        dto.setComplaintType(complaintType);
        dto.setDescription(description);
        dto.setComplaintDate(complaintDate);
        dto.setStatus(status);
        return dto;
    }
}