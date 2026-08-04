package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * Data Transfer Object (DTO) representing a Subject.
 * <p>
 * This class stores subject-related information such as
 * course details, subject name, and description.
 * </p>
 *
 * @author Mehreen
 */
@Entity
@Table(name = "st_subject")
public class SubjectDTO extends BaseDTO {

	@Column(name = "course_id", length = 50)
	private long courseId;

	@Column(name = "course_name", length = 50)
	private String courseName;

	@Column(name = "name", length = 50)
	private String name;

	@Column(name = "description", length = 50)
	private String description;

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
	 * Returns the subject name.
	 *
	 * @return the subject name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the subject name.
	 *
	 * @param name the subject name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the subject description.
	 *
	 * @return the subject description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the subject description.
	 *
	 * @param description the subject description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns the unique key used to identify the subject.
	 *
	 * @return the unique key
	 */
	@Override
	public String getUniqueKey() {
		return "name";
	}

	/**
	 * Returns the unique value of the subject.
	 *
	 * @return the subject name
	 */
	@Override
	public String getUniqueValue() {
		return name;
	}

	/**
	 * Returns the display label.
	 *
	 * @return the label
	 */
	@Override
	public String getLabel() {
		return "Subject Name";
	}

	/**
	 * Returns the database table name.
	 *
	 * @return the table name
	 */
	@Override
	public String getTableName() {
		return "Subject";
	}

	/**
	 * Returns the display value of the subject.
	 *
	 * @return the subject name
	 */
	@Override
	public String getValue() {
		return name;
	}
}