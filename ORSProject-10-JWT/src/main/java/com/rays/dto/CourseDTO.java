package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * Data Transfer Object (DTO) representing a Course.
 * <p>
 * This class stores course-related information such as course name,
 * duration, and description.
 * </p>
 *
 * @author Mehreen
 */
@Entity
@Table(name = "st_course")
public class CourseDTO extends BaseDTO {

	@Column(name = "name", length = 50)
	private String name;

	@Column(name = "duration", length = 50)
	private String duration;

	@Column(name = "description", length = 50)
	private String description;

	/**
	 * Returns the course name.
	 *
	 * @return the course name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the course name.
	 *
	 * @param name the course name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the course duration.
	 *
	 * @return the course duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * Sets the course duration.
	 *
	 * @param duration the course duration
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * Returns the course description.
	 *
	 * @return the course description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the course description.
	 *
	 * @param description the course description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns the unique key used to identify the course.
	 *
	 * @return the unique key
	 */
	@Override
	public String getUniqueKey() {
		return "name";
	}

	/**
	 * Returns the unique value of the course.
	 *
	 * @return the course name
	 */
	@Override
	public String getUniqueValue() {
		return name;
	}

	/**
	 * Returns the display label for the course.
	 *
	 * @return the label
	 */
	@Override
	public String getLabel() {
		return "Course Name";
	}

	/**
	 * Returns the database table name.
	 *
	 * @return the table name
	 */
	@Override
	public String getTableName() {
		return "Course";
	}

	/**
	 * Returns the display value of the course.
	 *
	 * @return the course name
	 */
	@Override
	public String getValue() {
		return name;
	}
}