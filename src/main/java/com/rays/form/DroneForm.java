package com.rays.form;
import javax.validation.constraints.NotEmpty;
import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DroneDTO;

public class DroneForm extends BaseForm{
	
	@NotEmpty(message = "Drone Code is Required")
	private String droneCode;
	
	@NotEmpty(message = "Operator Name is Required")
	private String operatorName;
	
	@NotEmpty(message = "Delivery Zone is Required")
	private String deliveryZone;
	
	@NotEmpty(message = "Status is Required")
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
	public BaseDTO getDto() {
		
		DroneDTO dto = initDTO(new DroneDTO());
		
		dto.setDroneCode(droneCode);
		dto.setOperatorName(operatorName);
		dto.setDeliveryZone(deliveryZone);
		dto.setStatus(status);
		return dto;
	}

}
