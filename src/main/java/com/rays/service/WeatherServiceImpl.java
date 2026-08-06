package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.WeatherDAOInt;
import com.rays.dto.WeatherDTO;

@Service
@Transactional
public class WeatherServiceImpl extends BaseServiceImpl<WeatherDTO, WeatherDAOInt> implements WeatherServiceInt {

}
