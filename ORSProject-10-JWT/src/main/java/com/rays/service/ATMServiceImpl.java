package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ATMDAOInt;
import com.rays.dto.ATMDTO;

@Service
@Transactional
public class ATMServiceImpl extends BaseServiceImpl<ATMDTO, ATMDAOInt> implements ATMServiceInt{

}
