package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_drone")
public class DroneDTO extends BaseDTO {

	@Column(name = "drone_code", length = 50)
	private String droneCode;

	@Column(name = "operator_name", length = 50)
	private String operatorName;

	@Column(name = "delivery_zone", length = 50)
	private String deliveryZone;

	@Column(name = "status", length = 50)
	private String status;

	public String getDroneCode() {
		return droneCode;
	}

	public void setDroneCode(String droneCode) {
		this.droneCode = droneCode;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getDeliveryZone() {
		return deliveryZone;
	}

	public void setDeliveryZone(String deliveryZone) {
		this.deliveryZone = deliveryZone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return operatorName;
	}

	@Override
	public String getUniqueKey() {
		return "droneCode";
	}

	@Override
	public String getUniqueValue() {
		return droneCode;
	}

	@Override
	public String getLabel() {
		return droneCode;
	}

	@Override
	public String getTableName() {
		return "Drone";
	}

}
