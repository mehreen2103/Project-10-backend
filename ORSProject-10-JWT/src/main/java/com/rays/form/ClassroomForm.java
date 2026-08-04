package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ClassroomDTO;

public class ClassroomForm extends BaseForm {

    @NotEmpty(message = "Please enter Room Number")
    private String roomNumber;

    @NotEmpty(message = "Please enter Floor")
    private String floor;

    @NotEmpty(message = "Please enter Capacity")
    private String capacity;

    @NotEmpty(message = "Please enter Building Name")
    private String buildingName;

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    @Override
    public BaseDTO getDto() {

        ClassroomDTO dto = new ClassroomDTO();

        dto.setId(id);
        dto.setRoomNumber(roomNumber);
        dto.setFloor(floor);
        dto.setCapacity(capacity);
        dto.setBuildingName(buildingName);

        return dto;
    }
}