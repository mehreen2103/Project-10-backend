package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LaptopDAOInt;
import com.rays.dto.LaptopDTO;

@Service
@Transactional
public class LaptopServiceImpl extends BaseServiceImpl<LaptopDTO, LaptopDAOInt> implements LaptopServiceInt{

}
