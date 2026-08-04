package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;


@Entity
@Table(name = "st_weather")
public class WeatherDTO extends BaseDTO {

	@Column(name = "alert_code", length = 50)
	private String alertCode;

	@Column(name = "city_name", length = 100)
	private String cityName;

	@Column(name = "temperature", length = 20)
	private String temperature;

	@Column(name = "status", length = 50)
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
	public String getUniqueKey() {
		return "alertCode";
	}

	
	@Override
	public String getUniqueValue() {
		return alertCode;
	}

	
	@Override
	public String getLabel() {
		return "Alert Code";
	}

	@Override
	public String getTableName() {
		return "Weather";
	}

	
	@Override
	public String getValue() {
		return cityName;
	}
}