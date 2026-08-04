package com.rays.form;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.FeeDTO;

public class FeeForm extends BaseForm {

    @NotEmpty(message = "Student Name is Required")
    private String studentName;

    @NotEmpty(message = "Amount is Required")
    private String amount;

    @NotNull(message = "Payment Date is Required")
    private Date paymentDate;

    @NotEmpty(message = "Payment Status is Required")
    private String paymentStatus;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public BaseDTO getDto() {

        FeeDTO dto = initDTO(new FeeDTO());

        dto.setStudentName(studentName);
        dto.setAmount(amount);
        dto.setPaymentDate(paymentDate);
        dto.setPaymentStatus(paymentStatus);

        return dto;
    }

}