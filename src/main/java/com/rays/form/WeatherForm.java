package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.WeatherDTO;


public class WeatherForm extends BaseForm {

	@NotEmpty(message = "Alert Code is required")
	private String alertCode;

	@NotEmpty(message = "City Name is required")
	private String cityName;

	@NotEmpty(message = "Temperature is required")
	private String temperature;

	@NotEmpty(message = "Status is required")
	private String status;

	public String getAlertCode() {
		return alertCode;
	}

	public void setAlertCode(String alertCode) {
		this.alertCode = alertCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		WeatherDTO dto = initDTO(new WeatherDTO());
		dto.setAlertCode(alertCode);
		dto.setCityName(cityName);
		dto.setTemperature(temperature);
		dto.setStatus(status);

		return dto;
	}
}