package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CourseDTO;
import com.rays.dto.SubjectDTO;
import com.rays.dto.TimeTableDTO;
import com.rays.form.TimeTableForm;
import com.rays.service.CourseServiceInt;
import com.rays.service.SubjectServiceInt;
import com.rays.service.TimeTableServiceInt;

/**
 * REST controller for managing Time Table operations.
 * <p>
 * This controller extends {@code BaseCtl} and provides REST endpoints
 * for performing CRUD operations on {@link TimeTableDTO} objects.
 * It also provides preload data required by the time table form.
 * </p>
 *
 * @author Mehreen
 */
@RestController
@RequestMapping(value = "TimeTable")
public class TimeTableCtl extends BaseCtl<TimeTableForm, TimeTableDTO, TimeTableServiceInt> {
	
	@Autowired
	private CourseServiceInt courseService;
	
	@Autowired
	private SubjectServiceInt subjectService;
	
	/**
	 * Loads the list of courses and subjects required by the time table form.
	 *
	 * @return an {@link ORSResponse} containing the course and subject lists
	 */
	@GetMapping("preload")
	public ORSResponse preload() {
	ORSResponse res = new ORSResponse(true);
	List<CourseDTO> list = courseService.search(new CourseDTO(), userContext);
	List<SubjectDTO> list1= subjectService.search(new SubjectDTO(), userContext);
	res.addResult("courseList", list);
	res.addResult("subjectList", list1);
	return res;
	}
}