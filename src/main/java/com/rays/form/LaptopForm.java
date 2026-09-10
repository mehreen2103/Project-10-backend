package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LaptopDTO;

public class LaptopForm extends BaseForm {

    @NotEmpty(message = "Please enter Brand Name")
    private String brandName;

    @NotEmpty(message = "Please enter Processor")
    private String processor;

    @NotEmpty(message = "Please enter RAM")
    private String ram;

    @NotEmpty(message = "Please enter Price")
    private String price;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public BaseDTO getDto() {
        LaptopDTO dto = new LaptopDTO();
        dto.setId(id);
        dto.setBrandName(brandName);
        dto.setProcessor(processor);
        dto.setRam(ram);
        dto.setPrice(price);
        return dto;
    }
}