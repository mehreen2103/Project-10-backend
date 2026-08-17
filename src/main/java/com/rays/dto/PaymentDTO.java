package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_payment")
public class PaymentDTO extends BaseDTO {

    @Column(name = "amount", length = 20)
    private String amount;

    @Column(name = "payment_date", length = 20)
    private String paymentDate;

    @Column(name = "payment_method", length = 50)
    private String paymentMethod;

    @Column(name = "transaction_id", length = 50)
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
    public String getValue() {
        return transactionId;
    }

    @Override
    public String getUniqueKey() {
        return "transactionId";
    }

    @Override
    public String getUniqueValue() {
        return transactionId;
    }

    @Override
    public String getLabel() {
        return "Payment";
    }

    @Override
    public String getTableName() {
        return "payment";
    }
}