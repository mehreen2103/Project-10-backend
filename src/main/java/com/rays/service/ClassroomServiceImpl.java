package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ClassroomDAOInt;
import com.rays.dto.ClassroomDTO;

@Service
@Transactional
public class ClassroomServiceImpl extends BaseServiceImpl<ClassroomDTO, ClassroomDAOInt> implements ClassroomServiceInt{

}
