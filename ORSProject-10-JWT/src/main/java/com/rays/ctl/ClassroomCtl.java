package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ClassroomDTO;
import com.rays.form.ClassroomForm;
import com.rays.service.ClassroomServiceInt;

@RestController
@RequestMapping(value = "Classroom")
public class ClassroomCtl extends BaseCtl<ClassroomForm, ClassroomDTO, ClassroomServiceInt>{

}
