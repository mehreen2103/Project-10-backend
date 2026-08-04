package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FeeDAOInt;
import com.rays.dto.FeeDTO;

@Service
@Transactional
public class FeeServiceImpl extends BaseServiceImpl<FeeDTO, FeeDAOInt>implements FeeServiceInt{

}
