package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.HotelDTO;

public class HotelForm extends BaseForm {

    @NotEmpty(message = "Please enter Hotel Name")
    private String hotelName;

    @NotEmpty(message = "Please enter Location")
    private String location;

    @NotEmpty(message = "Please enter Rating")
    private String rating;

    @NotEmpty(message = "Please enter Contact No")
    private String contactNo;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public BaseDTO getDto() {
        HotelDTO dto = new HotelDTO();
        dto.setId(id);
        dto.setHotelName(hotelName);
        dto.setLocation(location);
        dto.setRating(rating);
        dto.setContactNo(contactNo);
        return dto;
    }
}