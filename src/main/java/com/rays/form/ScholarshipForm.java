package com.rays.form;

import java.util.Date;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;

import com.rays.dto.ScholarshipDTO;

public class ScholarshipForm extends BaseForm {

    @NotEmpty(message = "Please enter Scholarship Name")
    private String scholarshipName;

    @NotEmpty(message = "Please enter Amount")
    private String amount;

    @NotEmpty(message = "Please enter Eligibility")
    private String eligibility;

    @NotNull(message = "Please select Last Date")
    private Date lastDate;

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getEligibility() {
        return eligibility;
    }

    public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

   

    @Override
    public BaseDTO getDto() {
        ScholarshipDTO dto = new ScholarshipDTO();

        dto.setId(id);
        dto.setScholarshipName(scholarshipName);
        dto.setAmount(amount);
        dto.setEligibility(eligibility);
        dto.setLastDate(lastDate);

        return dto;
    }
}