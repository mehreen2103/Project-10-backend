package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.CollegeDTO;
import com.rays.dto.CourseDTO;
import com.rays.dto.FacultyDTO;
import com.rays.dto.SubjectDTO;
import com.rays.form.FacultyForm;
import com.rays.service.CollegeServiceInt;
import com.rays.service.CourseServiceInt;
import com.rays.service.FacultyServiceInt;
import com.rays.service.SubjectServiceInt;

/**
 * REST controller for managing Faculty operations.
 * <p>
 * This controller extends {@code BaseCtl} and provides REST endpoints
 * for performing CRUD operations on {@link FacultyDTO} objects.
 * It also provides preload data required by the faculty form.
 * </p>
 *
 * @author Mehreen
 */
@RestController
@RequestMapping(value = "Faculty")
public class FacultyCtl extends BaseCtl<FacultyForm, FacultyDTO, FacultyServiceInt> {

	@Autowired
	private CourseServiceInt courseService;

	@Autowired
	private SubjectServiceInt subjectService;

	@Autowired
	private CollegeServiceInt collegeService;

	/**
	 * Loads the required dropdown data for the faculty form.
	 * <p>
	 * This method retrieves the list of courses, subjects, and colleges
	 * and returns them in the response.
	 * </p>
	 *
	 * @return an {@link ORSResponse} containing course, subject, and college lists
	 */
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		List<DropdownList> courseList = courseService.search(new CourseDTO(), userContext);
		List<DropdownList> subjectList = subjectService.search(new SubjectDTO(), userContext);
		List<DropdownList> collegeList = collegeService.search(new CollegeDTO(), userContext);
		res.addResult("courseList", courseList);
		res.addResult("subjectList", subjectList);
		res.addResult("collegeList", collegeList);
		return res;
	}

}