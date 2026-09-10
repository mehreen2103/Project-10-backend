package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_laptop")
public class LaptopDTO extends BaseDTO {

    @Column(name = "brand_name", length = 100)
    private String brandName;

    @Column(name = "processor", length = 100)
    private String processor;

    @Column(name = "ram", length = 50)
    private String ram;

    @Column(name = "price", length = 50)
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
    public String getValue() {
        return brandName;
    }

    @Override
    public String getUniqueKey() {
        return "brandName";
    }

    @Override
    public String getUniqueValue() {
        return brandName;
    }

    @Override
    public String getLabel() {
        return "Laptop";
    }

    @Override
    public String getTableName() {
        return "laptop";
    }
}