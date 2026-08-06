package com.rays.dto;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * Data Transfer Object (DTO) representing a User.
 * <p>
 * This class stores user-related information such as personal details,
 * login credentials, role information, account status, and login history.
 * </p>
 *
 * @author Mehreen
 */
@Entity
@Table(name = "st_user")
public class UserDTO extends BaseDTO {

	/** Indicates that the user account is active. */
	public static final String ACTIVE = "Active";

	/** Indicates that the user account is deactive. */
	public static final String DEACTIVE = "Deactive";

	/** Indicates that the user account is locked. */
	public static final String LOCKED = "Locked";

	@Column(name = "first_name", length = 50)
	private String firstName;

	@Column(name = "last_name", length = 50)
	private String lastName;

	@Column(name = "login_id", length = 50)
	private String loginId;

	@Column(name = "password", length = 50)
	private String password;

	@Column(name = "role_id")
	private Long roleId;

	@Column(name = "role_name", length = 50)
	private String roleName = null;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "gender", length = 10)
	private String gender;

	@Column(name = "phone", length = 50)
	private String phone;

	@Column(name = "alternate_mobile", length = 50)
	private String alternateMobile;

	@Column(name = "status", length = 20)
	private String status;

	@Column(name = "last_login")
	private Timestamp lastLogin;

	@Column(name = "unsucess_login")
	private Integer unsucessfullLoginAttempt = 0;

	@Column(name = "image_id")
	private Long imageId;

	/**
	 * Returns the user's first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the user's first name.
	 *
	 * @param firstName the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the user's last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the user's last name.
	 *
	 * @param lastName the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the login ID.
	 *
	 * @return the login ID
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * Sets the login ID.
	 *
	 * @param loginId the login ID
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * Returns the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Returns the role ID.
	 *
	 * @return the role ID
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * Sets the role ID.
	 *
	 * @param roleId the role ID
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * Returns the role name.
	 *
	 * @return the role name
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * Sets the role name.
	 *
	 * @param roleName the role name
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * Returns the date of birth.
	 *
	 * @return the date of birth
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * Sets the date of birth.
	 *
	 * @param dob the date of birth
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * Returns the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender the gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Returns the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phone the phone number
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Returns the alternate mobile number.
	 *
	 * @return the alternate mobile number
	 */
	public String getAlternateMobile() {
		return alternateMobile;
	}

	/**
	 * Sets the alternate mobile number.
	 *
	 * @param alternateMobile the alternate mobile number
	 */
	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}

	/**
	 * Returns the account status.
	 *
	 * @return the account status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the account status.
	 *
	 * @param status the account status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Returns the last login timestamp.
	 *
	 * @return the last login timestamp
	 */
	public Timestamp getLastLogin() {
		return lastLogin;
	}

	/**
	 * Sets the last login timestamp.
	 *
	 * @param lastLogin the last login timestamp
	 */
	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	/**
	 * Returns the number of unsuccessful login attempts.
	 *
	 * @return the unsuccessful login attempts
	 */
	public Integer getUnsucessfullLoginAttempt() {
		return unsucessfullLoginAttempt;
	}

	/**
	 * Sets the number of unsuccessful login attempts.
	 *
	 * @param unsucessfullLoginAttempt the unsuccessful login attempts
	 */
	public void setUnsucessfullLoginAttempt(Integer unsucessfullLoginAttempt) {
		this.unsucessfullLoginAttempt = unsucessfullLoginAttempt;
	}

	/**
	 * Returns the image ID.
	 *
	 * @return the image ID
	 */
	public Long getImageId() {
		return imageId;
	}

	/**
	 * Sets the image ID.
	 *
	 * @param imageId the image ID
	 */
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	/**
	 * Returns the user's full name.
	 *
	 * @return the full name
	 */
	public String getName() {
		return firstName + " " + lastName;
	}

	/**
	 * Returns the unique key used to identify the user.
	 *
	 * @return the unique key
	 */
	@Override
	public String getUniqueKey() {
		return "loginId";
	}

	/**
	 * Returns the unique value of the user.
	 *
	 * @return the login ID
	 */
	@Override
	public String getUniqueValue() {
		return loginId;
	}

	/**
	 * Returns the display label.
	 *
	 * @return the label
	 */
	@Override
	public String getLabel() {
		return "Login Id";
	}

	/**
	 * Returns the database table name.
	 *
	 * @return the table name
	 */
	@Override
	public String getTableName() {
		return "User";
	}

	/**
	 * Returns the display value.
	 *
	 * @return the display value
	 */
	@Override
	public String getValue() {
		return null;
	}
}