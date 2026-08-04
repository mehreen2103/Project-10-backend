package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * UserRegistrationForm is used to capture user registration
 * details from the UI. It contains validation constraints
 * for the registration fields.
 * 
 * @author Mehreen
 */
public class UserRegistrationForm {

	/**
	 * First name of the user.
	 */
	@NotEmpty(message = "First Name is required")
	private String firstName;

	/**
	 * Last name of the user.
	 */
	@NotEmpty(message = "Last Name is required")
	private String lastName;

	/**
	 * Login ID (Email) of the user.
	 */
	@Email
	@NotEmpty(message = "Login Id is required")
	private String loginId;

	/**
	 * Password of the user.
	 */
	@NotEmpty(message = "Password is required")
	private String password;

	/**
	 * Date of birth of the user.
	 */
	@NotNull(message = "Date of birth is required")
	private Date dob;

	/**
	 * Gender of the user.
	 */
	@NotEmpty(message = "Gender is required")
	private String gender;

	/**
	 * Mobile number of the user.
	 */
	@NotEmpty(message = "Mobile No is required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phone;

	/**
	 * Returns the first name.
	 * 
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 * 
	 * @param firstName the first name to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the last name.
	 * 
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 * 
	 * @param lastName the last name to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the login ID.
	 * 
	 * @return login ID
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * Sets the login ID.
	 * 
	 * @param loginId the login ID to set
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * Returns the password.
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 * 
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Returns the date of birth.
	 * 
	 * @return date of birth
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * Sets the date of birth.
	 * 
	 * @param dob the date of birth to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * Returns the gender.
	 * 
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender.
	 * 
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Returns the phone number.
	 * 
	 * @return phone number
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone number.
	 * 
	 * @param phone the phone number to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
}