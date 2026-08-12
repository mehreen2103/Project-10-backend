package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.LibraryDTO;
import com.rays.form.LibraryForm;
import com.rays.service.LibraryServiceInt;

@RestController
@RequestMapping(value = "Library")
public class LibraryCtl extends BaseCtl<LibraryForm, LibraryDTO, LibraryServiceInt>{

}
