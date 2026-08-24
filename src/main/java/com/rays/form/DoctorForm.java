package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DoctorDTO;

public class DoctorForm extends BaseForm {

    @NotEmpty(message = "Please enter Doctor Name")
    private String doctorName;

    @NotEmpty(message = "Please enter Specialization")
    private String specialization;

    @NotEmpty(message = "Please enter Experience")
    private String experience;

    @NotEmpty(message = "Please enter Contact No")
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
    public BaseDTO getDto() {
        DoctorDTO dto = new DoctorDTO();
        dto.setId(id);
        dto.setDoctorName(doctorName);
        dto.setSpecialization(specialization);
        dto.setExperience(experience);
        dto.setContactNo(contactNo);
        return dto;
    }
}