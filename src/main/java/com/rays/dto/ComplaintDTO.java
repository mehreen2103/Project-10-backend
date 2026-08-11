package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_complaint")
public class ComplaintDTO extends BaseDTO {

    @Column(name = "complaint_type", length = 100)
    private String complaintType;

    @Column(name = "description", length = 255)
    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "complaint_date")
    private Date complaintDate;

    @Column(name = "status", length = 50)
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
    public String getValue() {
        return complaintType;
    }

    @Override
    public String getUniqueKey() {
        return "description";
    }

    @Override
    public String getUniqueValue() {
        return description;
    }

    @Override
    public String getLabel() {
        return "Complaint";
    }

    @Override
    public String getTableName() {
        return "complaint";
    }
}