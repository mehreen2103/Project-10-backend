package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ComplaintDAOInt;
import com.rays.dto.ComplaintDTO;

@Service
@Transactional
public class ComplaintServiceImpl extends BaseServiceImpl<ComplaintDTO, ComplaintDAOInt> implements ComplaintServiceInt{

}
