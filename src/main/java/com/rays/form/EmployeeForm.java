package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.EmployeeDTO;

public class EmployeeForm extends BaseForm {

    @NotEmpty(message = "Please enter Employee Name")
    private String employeeName;

    @NotEmpty(message = "Please enter Department")
    private String department;

    @NotEmpty(message = "Please enter Salary")
    private String salary;

    @NotEmpty(message = "Please enter Email")
    private String email;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public BaseDTO getDto() {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(id);
        dto.setEmployeeName(employeeName);
        dto.setDepartment(department);
        dto.setSalary(salary);
        dto.setEmail(email);
        return dto;
    }
}