package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_classroom")
public class ClassroomDTO extends BaseDTO {

    @Column(name = "room_number", length = 50)
    private String roomNumber;

    @Column(name = "floor", length = 50)
    private String floor;

    @Column(name = "capacity", length = 20)
    private String capacity;

    @Column(name = "building_name", length = 100)
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
    public String getValue() {
        return roomNumber;
    }

    @Override
    public String getUniqueKey() {
        return "roomNumber";
    }

    @Override
    public String getUniqueValue() {
        return roomNumber;
    }

    @Override
    public String getLabel() {
        return "Classroom";
    }

    @Override
    public String getTableName() {
        return "classroom";
    }
}