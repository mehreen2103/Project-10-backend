package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_department")
public class DepartmentDTO  extends BaseDTO{
	
	@Column(name = "department_name", length =100)
	private String departmentName;
	
	@Column(name = "hod_name", length =100)
	private String hodName;
	
	@Column(name = "total_faculty", length =100)
	private String totalFaculty;
	
	@Column(name = "location", length =100)
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
	public String getValue() {
	    return departmentName;
	}

	@Override
	public String getUniqueKey() {
	    return "departmentName";
	}

	@Override
	public String getUniqueValue() {
	    return departmentName;
	}

	@Override
	public String getLabel() {
	    return departmentName;
	}

	@Override
	public String getTableName() {
	    return "Department";
	}
	
	

}
