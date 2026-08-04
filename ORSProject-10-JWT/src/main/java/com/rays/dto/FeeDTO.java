package com.rays.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_fee")
public class FeeDTO extends BaseDTO {

    @Column(name = "student_name", length = 50)
    private String studentName;

    @Column(name = "amount", length = 50)
    private String amount;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "payment_status", length = 50)
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
    public String getValue() {
        return studentName;
    }

    @Override
    public String getUniqueKey() {
        return "studentName";
    }

    @Override
    public String getUniqueValue() {
        return studentName;
    }

    @Override
    public String getLabel() {
        return studentName;
    }

    @Override
    public String getTableName() {
        return "Fee";
    }

}