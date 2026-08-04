package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DepartmentDAOInt;
import com.rays.dto.DepartmentDTO;

@Service
@Transactional
public class DepartmentServiceImpl extends BaseServiceImpl<DepartmentDTO, DepartmentDAOInt> implements DepartmentServiceInt {

}
