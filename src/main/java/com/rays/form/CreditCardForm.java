package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CreditCardDTO;

public class CreditCardForm extends BaseForm {

    @NotEmpty(message = "Please enter Card Number")
    private String cardNumber;

    @NotEmpty(message = "Please enter Card Holder")
    private String cardholder;

    @NotEmpty(message = "Please enter Expiry Date")
    private String expiryDate;

    @NotEmpty(message = "Please enter Card Type")
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
    public BaseDTO getDto() {

        CreditCardDTO dto = new CreditCardDTO();

        dto.setId(id);
        dto.setCardNumber(cardNumber);
        dto.setCardholder(cardholder);
        dto.setExpiryDate(expiryDate);
        dto.setCardType(cardType);

        return dto;
    }
}