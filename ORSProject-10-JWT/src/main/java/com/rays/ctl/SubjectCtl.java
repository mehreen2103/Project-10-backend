package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.CourseDTO;
import com.rays.dto.SubjectDTO;
import com.rays.form.SubjectForm;
import com.rays.service.CourseServiceInt;
import com.rays.service.SubjectServiceInt;

/**
 * REST controller for managing Subject operations.
 * <p>
 * This controller extends {@code BaseCtl} and provides REST endpoints
 * for performing CRUD operations on {@link SubjectDTO} objects.
 * It also provides preload data required by the subject form.
 * </p>
 *
 * @author Mehreen
 */
@RestController
@RequestMapping(value = "Subject")
public class SubjectCtl extends BaseCtl<SubjectForm, SubjectDTO, SubjectServiceInt> {
	
	@Autowired
	private CourseServiceInt courseService;
	
	
	/**
	 * Loads the list of courses required by the subject form.
	 *
	 * @return an {@link ORSResponse} containing the course list
	 */
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		List<DropdownList> list = courseService.search(new CourseDTO(), userContext);
		res.addResult("courseList", list);
		return res;
	}

}