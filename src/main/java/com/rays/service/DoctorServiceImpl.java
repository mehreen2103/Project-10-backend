package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DoctorDAOInt;
import com.rays.dto.DoctorDTO;

@Service
@Transactional
public class DoctorServiceImpl extends BaseServiceImpl<DoctorDTO, DoctorDAOInt> implements DoctorServiceInt{

}
