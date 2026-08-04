package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CourseDTO;

/**
 * Form class for Course.
 * <p>
 * This form is used to capture and validate course-related data
 * before converting it into a {@link CourseDTO}.
 * </p>
 *
 * @author Mehreen
 */
public class CourseForm extends BaseForm {

	@NotEmpty(message = "Name is required")
	private String name;

	@NotEmpty(message = "Duration is required")
	private String duration;

	@NotEmpty(message = "Description is required")
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
	 * Converts this form into a {@link CourseDTO}.
	 *
	 * @return the populated CourseDTO object
	 */
	@Override
	public BaseDTO getDto() {

		CourseDTO dto = initDTO(new CourseDTO());
		dto.setName(name);
		dto.setDuration(duration);
		dto.setDescription(description);

		return dto;
	}

}