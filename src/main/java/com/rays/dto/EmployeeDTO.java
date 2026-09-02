package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_employee")
public class EmployeeDTO extends BaseDTO {

    @Column(name = "employee_name", length = 100)
    private String employeeName;

    @Column(name = "department", length = 100)
    private String department;

    @Column(name = "salary", length = 20)
    private String salary;

    @Column(name = "email", length = 100)
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
    public String getValue() {
        return employeeName;
    }

    @Override
    public String getUniqueKey() {
        return "employeeName";
    }

    @Override
    public String getUniqueValue() {
        return employeeName;
    }

    @Override
    public String getLabel() {
        return "Employee";
    }

    @Override
    public String getTableName() {
        return "employee";
    }
}