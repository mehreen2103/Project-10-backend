package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DepartmentDTO;

public class DepartmentForm extends BaseForm {
	
	@NotEmpty(message = "Department Name is Required")
	private String departmentName;
	
	@NotEmpty(message = "HOD Name is Required")
	private String hodName;
	
	@NotEmpty(message = "Total Faculty is Required")
	private String totalFaculty;
	
	@NotEmpty(message = "Location is Required")
	private String location;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getHodName() {
		return hodName;
	}

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}

	public String getTotalFaculty() {
		return totalFaculty;
	}

	public void setTotalFaculty(String totalFaculty) {
		this.totalFaculty = totalFaculty;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public BaseDTO getDto() {
		
		DepartmentDTO dto = initDTO(new DepartmentDTO());
		
		dto.setDepartmentName(departmentName);
		dto.setHodName(hodName);
		dto.setTotalFaculty(totalFaculty);
		dto.setLocation(location);
		return dto;
	}

}
