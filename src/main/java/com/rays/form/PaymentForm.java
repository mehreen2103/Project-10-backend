package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PaymentDTO;

public class PaymentForm extends BaseForm {

    @NotEmpty(message = "Please enter Amount")
    private String amount;

    @NotEmpty(message = "Please enter Payment Date")
    private String paymentDate;

    @NotEmpty(message = "Please enter Payment Method")
    private String paymentMethod;

    @NotEmpty(message = "Please enter Transaction Id")
    private String transactionId;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public BaseDTO getDto() {
        PaymentDTO dto = new PaymentDTO();
        dto.setId(id);
        dto.setAmount(amount);
        dto.setPaymentDate(paymentDate);
        dto.setPaymentMethod(paymentMethod);
        dto.setTransactionId(transactionId);
        return dto;
    }
}