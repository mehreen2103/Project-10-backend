package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.HotelDAOInt;
import com.rays.dto.HotelDTO;

@Service
@Transactional
public class HotelServiceImpl extends BaseServiceImpl<HotelDTO, HotelDAOInt>implements HotelServiceInt{

}
