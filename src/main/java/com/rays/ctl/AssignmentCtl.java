package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.AssignmentDTO;
import com.rays.form.AssignmentForm;
import com.rays.service.AssignmentServiceInt;

@RestController
@RequestMapping(value = "Assignment")
public class AssignmentCtl extends BaseCtl<AssignmentForm, AssignmentDTO, AssignmentServiceInt> {

}
