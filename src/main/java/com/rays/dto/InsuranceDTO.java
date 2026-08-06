package com.rays.dto;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.rays.common.BaseDTO;


@Entity
@Table(name = "st_insurance")
public class InsuranceDTO extends BaseDTO {

    @Column(name = "policy_holder_name", length = 100)
    private String policyHolderName;

    @Column(name = "policy_type", length = 50)
    private String policyType;

    @Column(name = "premium_amount", length = 20)
    private String premiumAmount;

    @Temporal(TemporalType.DATE)
    @Column(name = "expiry_date")
    private Date expiryDate;

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(String premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String getValue() {
    	return policyHolderName;
    }

    @Override
    public String getUniqueKey() {
    	return "policyHolderName";
    }

    @Override
    public String getUniqueValue() {
    	return policyHolderName;
    }

    @Override
    public String getLabel() {
    	return "Insurance";
    }

    @Override
    public String getTableName() {
    	return "insurance";
    }
}