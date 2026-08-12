package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LibraryDAOInt;
import com.rays.dto.LibraryDTO;

@Service
@Transactional
public class LibraryServiceImpl extends BaseServiceImpl<LibraryDTO, LibraryDAOInt> implements LibraryServiceInt {

}
