package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_creditcard")
public class CreditCardDTO extends BaseDTO {

    @Column(name = "card_number", length = 100)
    private String cardNumber;

    @Column(name = "cardholder", length = 100)
    private String cardholder;

    @Column(name = "expiry_date", length = 50)
    private String expiryDate;

    @Column(name = "card_type", length = 50)
    private String cardType;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String getValue() {
        return cardNumber;
    }

    @Override
    public String getUniqueKey() {
        return "cardNumber";
    }

    @Override
    public String getUniqueValue() {
        return cardNumber;
    }

    @Override
    public String getLabel() {
        return "Credit Card";
    }

    @Override
    public String getTableName() {
        return "creditcard";
    }
}