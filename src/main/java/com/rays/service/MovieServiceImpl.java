package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.MovieDAOInt;
import com.rays.dto.MovieDTO;

@Service
@Transactional
public class MovieServiceImpl extends BaseServiceImpl<MovieDTO, MovieDAOInt> implements MovieServiceInt {

}
