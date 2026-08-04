package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.CollegeDTO;
import com.rays.form.CollegeForm;
import com.rays.service.CollegeServiceInt;

/**
 * REST controller for managing College operations.
 * <p>
 * This controller extends {@code BaseCtl} and provides REST endpoints
 * for performing CRUD operations on {@link CollegeDTO} objects using
 * {@link CollegeServiceInt}.
 * </p>
 *
 * @author Mehreen
 */
@RestController
@RequestMapping(value = "College")
public class CollegeCtl extends BaseCtl<CollegeForm, CollegeDTO, CollegeServiceInt> {

}