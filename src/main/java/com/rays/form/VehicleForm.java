package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VehicleDTO;

public class VehicleForm extends BaseForm {

    @NotEmpty(message = "Please enter Vehicle Name")
    private String vehicleName;

    @NotEmpty(message = "Please enter Model")
    private String model;

    @NotEmpty(message = "Please enter Color")
    private String color;

    @NotEmpty(message = "Please enter Price")
    private String price;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public BaseDTO getDto() {
        VehicleDTO dto = new VehicleDTO();
        dto.setId(id);
        dto.setVehicleName(vehicleName);
        dto.setModel(model);
        dto.setColor(color);
        dto.setPrice(price);
        return dto;
    }
}