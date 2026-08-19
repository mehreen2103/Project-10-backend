package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PatientDTO;

public class PatientForm extends BaseForm {

    @NotEmpty(message = "Please enter Patient Name")
    private String patientName;

    @NotEmpty(message = "Please enter Disease")
    private String disease;

    @NotEmpty(message = "Please enter Doctor Name")
    private String doctorName;

    @NotNull(message = "Please enter Admission Date")
    private Date admissionDate;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public BaseDTO getDto() {
        PatientDTO dto = new PatientDTO();
        dto.setId(id);
        dto.setPatientName(patientName);
        dto.setDisease(disease);
        dto.setDoctorName(doctorName);
        dto.setAdmissionDate(admissionDate);
        return dto;
    }
}