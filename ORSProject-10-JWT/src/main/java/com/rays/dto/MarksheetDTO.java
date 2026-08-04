package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * Data Transfer Object (DTO) representing a Marksheet.
 * <p>
 * This class stores marksheet details including roll number,
 * student information, and marks obtained in Physics,
 * Chemistry, and Mathematics.
 * </p>
 *
 * @author Mehreen
 */
@Entity
@Table(name = "st_marksheet")
public class MarksheetDTO extends BaseDTO {

	@Column(name = "roll_no", length = 20)
	protected String rollNo = null;

	@Column(name = "student_id")
	protected Long studentId;

	@Column(name = "name", length = 50)
	protected String name = null;

	@Column(name = "physics")
	protected Integer physics;

	@Column(name = "chemistry")
	protected Integer chemistry;

	@Column(name = "maths")
	protected Integer maths;

	/**
	 * Returns the student's roll number.
	 *
	 * @return the roll number
	 */
	public String getRollNo() {
		return rollNo;
	}

	/**
	 * Sets the student's roll number.
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
	 * Returns the student's name.
	 *
	 * @return the student name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the student's name.
	 *
	 * @param name the student name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the Physics marks.
	 *
	 * @return the Physics marks
	 */
	public Integer getPhysics() {
		return physics;
	}

	/**
	 * Sets the Physics marks.
	 *
	 * @param physics the Physics marks
	 */
	public void setPhysics(Integer physics) {
		this.physics = physics;
	}

	/**
	 * Returns the Chemistry marks.
	 *
	 * @return the Chemistry marks
	 */
	public Integer getChemistry() {
		return chemistry;
	}

	/**
	 * Sets the Chemistry marks.
	 *
	 * @param chemistry the Chemistry marks
	 */
	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}

	/**
	 * Returns the Mathematics marks.
	 *
	 * @return the Mathematics marks
	 */
	public Integer getMaths() {
		return maths;
	}

	/**
	 * Sets the Mathematics marks.
	 *
	 * @param maths the Mathematics marks
	 */
	public void setMaths(Integer maths) {
		this.maths = maths;
	}

	/**
	 * Returns the unique key used to identify the marksheet.
	 *
	 * @return the unique key
	 */
	@Override
	public String getUniqueKey() {
		return "rollNo";
	}

	/**
	 * Returns the unique value of the marksheet.
	 *
	 * @return the roll number
	 */
	@Override
	public String getUniqueValue() {
		return rollNo;
	}

	/**
	 * Returns the display label.
	 *
	 * @return the label
	 */
	@Override
	public String getLabel() {
		return "Roll No";
	}

	/**
	 * Returns the database table name.
	 *
	 * @return the table name
	 */
	@Override
	public String getTableName() {
		return "Marksheet";
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