package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_doctor")
public class DoctorDTO extends BaseDTO {

    @Column(name = "doctor_name", length = 100)
    private String doctorName;

    @Column(name = "specialization", length = 100)
    private String specialization;

    @Column(name = "experience", length = 10)
    private String experience;

    @Column(name = "contact_no", length = 20)
    private String contactNo;

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String getValue() {
        return doctorName;
    }

    @Override
    public String getUniqueKey() {
        return "doctorName";
    }

    @Override
    public String getUniqueValue() {
        return doctorName;
    }

    @Override
    public String getLabel() {
        return "Doctor";
    }

    @Override
    public String getTableName() {
        return "doctor";
    }
}