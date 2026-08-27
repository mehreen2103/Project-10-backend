package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.VehicleDAOInt;
import com.rays.dto.VehicleDTO;

@Service
@Transactional
public class VehicleServiceImpl extends BaseServiceImpl<VehicleDTO, VehicleDAOInt> implements VehicleServiceInt{

}
