package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CollegeDTO;

/**
 * Form class for College.
 * <p>
 * This form is used to capture and validate college-related data
 * before converting it into a {@link CollegeDTO}.
 * </p>
 *
 * @author Mehreen
 */
public class CollegeForm extends BaseForm {

	@NotEmpty(message = "Name is required")
	private String name;

	@NotEmpty(message = "Address is required")
	private String address;

	@NotEmpty(message = "State is required")
	private String state;

	@NotEmpty(message = "City is required")
	private String city;

	@NotNull(message = "Phone No is required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phoneNo;

	/**
	 * Returns the college name.
	 *
	 * @return the college name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the college name.
	 *
	 * @param name the college name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the college address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the college address.
	 *
	 * @param address the address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Returns the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Returns the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Returns the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phoneNo the phone number
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * Converts this form into a {@link CollegeDTO}.
	 *
	 * @return the populated CollegeDTO object
	 */
	@Override
	public BaseDTO getDto() {

		CollegeDTO dto = initDTO(new CollegeDTO());
		dto.setName(name);
		dto.setAddress(address);
		dto.setState(state);
		dto.setCity(city);
		dto.setPhoneNo(phoneNo);

		return dto;
	}
}