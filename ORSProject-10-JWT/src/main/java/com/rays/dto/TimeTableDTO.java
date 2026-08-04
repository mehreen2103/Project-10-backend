package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * Data Transfer Object (DTO) representing a Time Table.
 * <p>
 * This class stores examination schedule details such as course,
 * subject, exam date, exam time, semester, and description.
 * </p>
 *
 * @author Mehreen
 */
@Entity
@Table(name = "st_timetable")
public class TimeTableDTO extends BaseDTO {

	@Column(name = "course_id", length = 50)
	private long courseId;

	@Column(name = "course_name", length = 50)
	private String courseName;

	@Column(name = "subject_id", length = 50)
	private long subjectId;

	@Column(name = "subject_name", length = 50)
	private String subjectName;

	@Column(name = "exam_date")
	private Date examDate;

	@Column(name = "exam_time", length = 50)
	private String examTime;

	@Column(name = "semester", length = 30)
	private String semester;

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
	 * Returns the examination date.
	 *
	 * @return the examination date
	 */
	public Date getExamDate() {
		return examDate;
	}

	/**
	 * Sets the examination date.
	 *
	 * @param examDate the examination date
	 */
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	/**
	 * Returns the examination time.
	 *
	 * @return the examination time
	 */
	public String getExamTime() {
		return examTime;
	}

	/**
	 * Sets the examination time.
	 *
	 * @param examTime the examination time
	 */
	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	/**
	 * Returns the semester.
	 *
	 * @return the semester
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * Sets the semester.
	 *
	 * @param semester the semester
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}

	/**
	 * Returns the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns the unique key used to identify the timetable.
	 *
	 * @return the unique key
	 */
	@Override
	public String getUniqueKey() {
		return "courseName";
	}

	/**
	 * Returns the unique value of the timetable.
	 *
	 * @return the course name
	 */
	@Override
	public String getUniqueValue() {
		return courseName;
	}

	/**
	 * Returns the display label.
	 *
	 * @return the label
	 */
	@Override
	public String getLabel() {
		return null;
	}

	/**
	 * Returns the database table name.
	 *
	 * @return the table name
	 */
	@Override
	public String getTableName() {
		return "TimeTable";
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