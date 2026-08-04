package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SubjectDTO;

/**
 * Form class for Subject.
 * <p>
 * This form is used to capture and validate subject-related data
 * before converting it into a {@link SubjectDTO}.
 * </p>
 *
 * @author Mehreen
 */
public class SubjectForm extends BaseForm {

	@NotNull(message = "Course is required")
	@Min(1)
	private Long courseId = 0L;

	private String courseName;

	@NotEmpty(message = "Name is required")
	private String name;

	@NotEmpty(message = "Description is required")
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
	 * Converts this form into a {@link SubjectDTO}.
	 *
	 * @return the populated SubjectDTO object
	 */
	@Override
	public BaseDTO getDto() {

		SubjectDTO dto = initDTO(new SubjectDTO());

		dto.setCourseId(courseId);
		dto.setCourseName(courseName);
		dto.setName(name);
		dto.setDescription(description);

		return dto;
	}
}