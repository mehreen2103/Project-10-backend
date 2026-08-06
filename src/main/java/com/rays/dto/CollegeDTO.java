package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * Data Transfer Object (DTO) representing a College.
 * <p>
 * This class stores college-related information such as name, address,
 * state, city, and phone number.
 * </p>
 *
 * @author Mehreen
 */
@Entity
@Table(name = "st_college")
public class CollegeDTO extends BaseDTO {

	@Column(name = "name", length = 50)
	private String name;

	@Column(name = "address", length = 50)
	private String address;

	@Column(name = "state", length = 50)
	private String state;

	@Column(name = "city", length = 50)
	private String city;

	@Column(name = "phone_no", length = 15)
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
	 * @return the college address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the college address.
	 *
	 * @param address the college address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Returns the state in which the college is located.
	 *
	 * @return the state name
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state in which the college is located.
	 *
	 * @param state the state name
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Returns the city in which the college is located.
	 *
	 * @return the city name
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city in which the college is located.
	 *
	 * @param city the city name
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Returns the college phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * Sets the college phone number.
	 *
	 * @param phoneNo the phone number
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * Returns the unique key used for identifying the college.
	 *
	 * @return the unique key
	 */
	@Override
	public String getUniqueKey() {
		return "name";
	}

	/**
	 * Returns the unique value of the college.
	 *
	 * @return the college name
	 */
	@Override
	public String getUniqueValue() {
		return name;
	}

	/**
	 * Returns the label used for the college.
	 *
	 * @return the label
	 */
	@Override
	public String getLabel() {
		return "College Name";
	}

	/**
	 * Returns the database table name.
	 *
	 * @return the table name
	 */
	@Override
	public String getTableName() {
		return "College";
	}

	/**
	 * Returns the display value of the college.
	 *
	 * @return the college name
	 */
	@Override
	public String getValue() {
		return name;
	}
}