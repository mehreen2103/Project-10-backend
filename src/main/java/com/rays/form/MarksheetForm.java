package com.rays.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MarksheetDTO;

/**
 * Form class for Marksheet.
 * <p>
 * This form is used to capture and validate marksheet-related data
 * before converting it into a {@link MarksheetDTO}.
 * </p>
 *
 * @author Mehreen
 */
public class MarksheetForm extends BaseForm {

	@NotEmpty(message = "Roll No is required")
	protected String rollNo = null;

	@NotNull(message = "Student Name is required")
	@Min(1)
	protected Long studentId;

	protected String name = null;

	@NotNull(message = "Physics is required")
	@Max(99)
	@Min(0)
	protected Integer physics;

	@NotNull(message = "Chemistry is required")
	@Max(99)
	@Min(0)
	protected Integer chemistry;

	@NotNull(message = "Maths is required")
	@Max(99)
	@Min(0)
	protected Integer maths;

	/**
	 * Returns the roll number.
	 *
	 * @return the roll number
	 */
	public String getRollNo() {
		return rollNo;
	}

	/**
	 * Sets the roll number.
	 *
	 * @param rollNo the roll number
	 */
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * Returns the student ID.
	 *
	 * @return the student ID
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * Sets the student ID.
	 *
	 * @param studentId the student ID
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	/**
	 * Returns the student name.
	 *
	 * @return the student name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the student name.
	 *
	 * @param name the student name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the physics marks.
	 *
	 * @return the physics marks
	 */
	public Integer getPhysics() {
		return physics;
	}

	/**
	 * Sets the physics marks.
	 *
	 * @param physics the physics marks
	 */
	public void setPhysics(Integer physics) {
		this.physics = physics;
	}

	/**
	 * Returns the chemistry marks.
	 *
	 * @return the chemistry marks
	 */
	public Integer getChemistry() {
		return chemistry;
	}

	/**
	 * Sets the chemistry marks.
	 *
	 * @param chemistry the chemistry marks
	 */
	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}

	/**
	 * Returns the maths marks.
	 *
	 * @return the maths marks
	 */
	public Integer getMaths() {
		return maths;
	}

	/**
	 * Sets the maths marks.
	 *
	 * @param maths the maths marks
	 */
	public void setMaths(Integer maths) {
		this.maths = maths;
	}

	/**
	 * Converts this form into a {@link MarksheetDTO}.
	 *
	 * @return the populated MarksheetDTO object
	 */
	@Override
	public BaseDTO getDto() {

		MarksheetDTO dto = initDTO(new MarksheetDTO());
		dto.setRollNo(rollNo);
		dto.setName(name);
		dto.setStudentId(studentId);
		dto.setPhysics(physics);
		dto.setChemistry(chemistry);
		dto.setMaths(maths);

		return dto;
	}
}