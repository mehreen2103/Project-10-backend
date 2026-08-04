package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.AssignmentDAOInt;
import com.rays.dto.AssignmentDTO;

@Service
@Transactional
public class AssignmentServiceImpl extends BaseServiceImpl<AssignmentDTO, AssignmentDAOInt> implements AssignmentServiceInt{

}
