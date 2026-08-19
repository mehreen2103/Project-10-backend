package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PatientDAOInt;
import com.rays.dto.PatientDTO;

@Service
@Transactional
public class PatientServiceImpl extends BaseServiceImpl<PatientDTO, PatientDAOInt> implements PatientServiceInt{

}
