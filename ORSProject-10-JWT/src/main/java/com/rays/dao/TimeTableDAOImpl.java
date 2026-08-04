package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.CourseDTO;
import com.rays.dto.SubjectDTO;
import com.rays.dto.TimeTableDTO;

/**
 * DAO implementation class for {@link TimeTableDTO}.
 * <p>
 * This class extends {@code BaseDAOImpl} and provides database
 * operations for TimeTable entities.
 * </p>
 *
 * @author Mehreen
 */
@Repository
public class TimeTableDAOImpl extends BaseDAOImpl<TimeTableDTO> implements TimeTableDAOInt {

	@Autowired
	SubjectDAOInt subjectService;

	@Autowired
	CourseDAOInt courseService;

	/**
	 * Returns the DTO class managed by this DAO.
	 *
	 * @return the {@link TimeTableDTO} class
	 */
	@Override
	public Class<TimeTableDTO> getDTOClass() {
		return TimeTableDTO.class;
	}

	/**
	 * Populates the timetable DTO with related subject and course names.
	 *
	 * @param dto the timetable DTO
	 * @param userContext the current user context
	 */
	@Override
	protected void populate(TimeTableDTO dto, UserContext userContext) {

		SubjectDTO subjectDto = subjectService.findByPK(dto.getSubjectId(), userContext);
		if (subjectDto != null) {
			dto.setSubjectName(subjectDto.getName());
		}

		CourseDTO courseDto = courseService.findByPK(dto.getCourseId(), userContext);
		if (courseDto != null) {
			dto.setCourseName(courseDto.getName());
		}
	}

	/**
	 * Builds the WHERE clause predicates based on the search criteria.
	 *
	 * @param dto the timetable search criteria
	 * @param builder the criteria builder
	 * @param qRoot the query root
	 * @return the list of predicates
	 */
	@Override
	protected List<Predicate> getWhereClause(TimeTableDTO dto, CriteriaBuilder builder, Root<TimeTableDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSubjectName())) {

			whereCondition.add(builder.like(qRoot.get("subjectName"), dto.getSubjectName() + "%"));
		}
		if (!isEmptyString(dto.getCourseName())) {

			whereCondition.add(builder.like(qRoot.get("courseName"), dto.getCourseName() + "%"));
		}
		return whereCondition;
	}
}