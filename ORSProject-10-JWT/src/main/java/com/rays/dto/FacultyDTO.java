package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * Data Transfer Object (DTO) representing a Faculty.
 * <p>
 * This class stores faculty details such as personal information,
 * qualification, college, course, and subject details.
 * </p>
 *
 * @author Mehreen
 */
@Entity
@Table(name = "st_faculty")
public class FacultyDTO extends BaseDTO {

	@Column(name = "first_name", length = 50)
	private String firstName;

	@Column(name = "last_name", length = 50)
	private String lastName;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "gender", length = 10)
	private String gender;

	@Column(name = "phone_no", length = 15)
	private String phoneNo;

	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "qualification", length = 15)
	private String qualification;

	@Column(name = "college_id", length = 50)
	private long collegeId;

	@Column(name = "college_name", length = 50)
	private String collegeName;

	@Column(name = "course_id", length = 50)
	private long courseId;

	@Column(name = "course_name", length = 50)
	private String courseName;

	@Column(name = "subject_id", length = 50)
	private long subjectId;

	@Column(name = "subject_name", length = 50)
	private String subjectName;

	/**
	 * Returns the faculty first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the faculty first name.
	 *
	 * @param firstName the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the faculty last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the faculty last name.
	 *
	 * @param lastName the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the faculty date of birth.
	 *
	 * @return the date of birth
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * Sets the faculty date of birth.
	 *
	 * @param dob the date of birth
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * Returns the faculty gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the faculty gender.
	 *
	 * @param gender the gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Returns the faculty phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * Sets the faculty phone number.
	 *
	 * @param phoneNo the phone number
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * Returns the faculty email address.
	 *
	 * @return the email address
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the faculty email address.
	 *
	 * @param email the email address
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Returns the faculty qualification.
	 *
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * Sets the faculty qualification.
	 *
	 * @param qualification the qualification
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * Returns the college ID.
	 *
	 * @return the college ID
	 */
	public long getCollegeId() {
		return collegeId;
	}

	/**
	 * Sets the college ID.
	 *
	 * @param collegeId the college ID
	 */
	public void setCollegeId(long collegeId) {
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
	 * Returns the course ID.
	 *
	 * @return the course ID
	 */
	public long getCourseId() {
		return courseId;
	}

	/**
	 * Sets the course ID.
	 *
	 * @param courseId the course ID
	 */
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	/**
	 * Returns the course name.
	 *
	 * @return the course name
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * Sets the course name.
	 *
	 * @param courseName the course name
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * Returns the subject ID.
	 *
	 * @return the subject ID
	 */
	public long getSubjectId() {
		return subjectId;
	}

	/**
	 * Sets the subject ID.
	 *
	 * @param subjectId the subject ID
	 */
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	/**
	 * Returns the subject name.
	 *
	 * @return the subject name
	 */
	public String getSubjectName() {
		return subjectName;
	}

	/**
	 * Sets the subject name.
	 *
	 * @param subjectName the subject name
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * Returns the unique key used to identify the faculty.
	 *
	 * @return the unique key
	 */
	@Override
	public String getUniqueKey() {
		return "email";
	}

	/**
	 * Returns the unique value of the faculty.
	 *
	 * @return the email address
	 */
	@Override
	public String getUniqueValue() {
		return email;
	}

	/**
	 * Returns the display label.
	 *
	 * @return the label
	 */
	@Override
	public String getLabel() {
		return "Email";
	}

	/**
	 * Returns the database table name.
	 *
	 * @return the table name
	 */
	@Override
	public String getTableName() {
		return "Faculty";
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