package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_patient")
public class PatientDTO extends BaseDTO {

    @Column(name = "patient_name", length = 100)
    private String patientName;

    @Column(name = "disease", length = 100)
    private String disease;

    @Column(name = "doctor_name", length = 100)
    private String doctorName;

    @Temporal(TemporalType.DATE)
    @Column(name = "admission_date")
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
    public String getValue() {
        return patientName;
    }

    @Override
    public String getUniqueKey() {
        return "patientName";
    }

    @Override
    public String getUniqueValue() {
        return patientName;
    }

    @Override
    public String getLabel() {
        return "Patient";
    }

    @Override
    public String getTableName() {
        return "patient";
    }
}