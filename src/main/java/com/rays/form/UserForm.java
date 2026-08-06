package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.UserDTO;

/**
 * UserForm is used to capture user details from the UI
 * and convert them into a UserDTO object.
 * It also contains validation constraints for user input.
 * 
 * @author Mehreen
 */
public class UserForm extends BaseForm {

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
	 * Login ID of the user.
	 */
	@NotEmpty(message = "Login Id is required")
	private String loginId;

	/**
	 * Password of the user.
	 */
	@NotEmpty(message = "Password is required")
	private String password;

	/**
	 * Role ID assigned to the user.
	 */
	@NotNull(message = "Role is required")
	@Min(1)
	private Long roleId;

	/**
	 * Role name of the user.
	 */
	private String roleName = null;

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
	@NotNull(message = "Mobile No is required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phone;

	/**
	 * Alternate mobile number of the user.
	 */
	@NotEmpty(message = "Alternate Mobile No is required")
	private String alternateMobile;

	/**
	 * Current status of the user.
	 */
	@NotEmpty(message = "Status is required")
	private String status;

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
	 * Returns the role ID.
	 * 
	 * @return role ID
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * Sets the role ID.
	 * 
	 * @param roleId the role ID to set
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * Returns the role name.
	 * 
	 * @return role name
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * Sets the role name.
	 * 
	 * @param roleName the role name to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	/**
	 * Returns the alternate mobile number.
	 * 
	 * @return alternate mobile number
	 */
	public String getAlternateMobile() {
		return alternateMobile;
	}

	/**
	 * Sets the alternate mobile number.
	 * 
	 * @param alternateMobile the alternate mobile number to set
	 */
	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}

	/**
	 * Returns the status.
	 * 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 * 
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Converts this form object into a UserDTO object.
	 * 
	 * @return populated UserDTO object
	 */
	@Override
	public BaseDTO getDto() {

		UserDTO dto = initDTO(new UserDTO());
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setLoginId(loginId);
		dto.setPassword(password);
		dto.setRoleId(roleId);
		dto.setRoleName(roleName);
		dto.setDob(dob);
		dto.setGender(gender);
		dto.setPhone(phone);
		dto.setAlternateMobile(alternateMobile);
		dto.setStatus(status);

		return dto;
	}
}