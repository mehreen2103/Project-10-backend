package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * Data Transfer Object (DTO) representing a Student.
 * <p>
 * This class stores student-related information such as enrollment number,
 * personal details, contact information, and associated college details.
 * </p>
 *
 * @author Mehreen
 */
@Entity
@Table(name = "st_student")
public class StudentDTO extends BaseDTO {

	@Column(name = "enrol_no", length = 20)
	private String enrolNo;

	@Column(name = "first_name", length = 50)
	private String firstName;

	@Column(name = "last_name", length = 50)
	private String lastName;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "phone_no", length = 15)
	private String phoneNo;

	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "college_id")
	private Long collegeId;

	@Column(name = "college_name", length = 50)
	private String collegeName;

	/**
	 * Returns the enrollment number.
	 *
	 * @return the enrollment number
	 */
	public String getEnrolNo() {
		return enrolNo;
	}

	/**
	 * Sets the enrollment number.
	 *
	 * @param enrolNo the enrollment number
	 */
	public void setEnrolNo(String enrolNo) {
		this.enrolNo = enrolNo;
	}

	/**
	 * Returns the student's first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the student's first name.
	 *
	 * @param firstName the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the student's last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the student's last name.
	 *
	 * @param lastName the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the student's date of birth.
	 *
	 * @return the date of birth
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * Sets the student's date of birth.
	 *
	 * @param dob the date of birth
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * Returns the student's phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * Sets the student's phone number.
	 *
	 * @param phoneNo the phone number
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * Returns the student's email address.
	 *
	 * @return the email address
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the student's email address.
	 *
	 * @param email the email address
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Returns the college ID.
	 *
	 * @return the college ID
	 */
	public Long getCollegeId() {
		return collegeId;
	}

	/**
	 * Sets the college ID.
	 *
	 * @param collegeId the college ID
	 */
	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	/**
	 * Returns the college name.
	 *
	 * @return the college name
	 */
	public String getCollegeName() {
		return collegeName;
	}

	/**
	 * Sets the college name.
	 *
	 * @param collegeName the college name
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/**
	 * Returns the unique key used to identify the student.
	 *
	 * @return the unique key
	 */
	@Override
	public String getUniqueKey() {
		return "enrolNo";
	}

	/**
	 * Returns the unique value of the student.
	 *
	 * @return the enrollment number
	 */
	@Override
	public String getUniqueValue() {
		return enrolNo;
	}

	/**
	 * Returns the display label.
	 *
	 * @return the label
	 */
	@Override
	public String getLabel() {
		return "Enroll No";
	}

	/**
	 * Returns the database table name.
	 *
	 * @return the table name
	 */
	@Override
	public String getTableName() {
		return "Student";
	}

	/**
	 * Returns the display value of the student.
	 *
	 * @return the student's full name
	 */
	@Override
	public String getValue() {
		return firstName + " " + lastName;
	}
}