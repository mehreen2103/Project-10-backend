package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CreditCardDAOInt;
import com.rays.dto.CreditCardDTO;

@Service
@Transactional
public class CreditCardServiceImpl extends BaseServiceImpl<CreditCardDTO, CreditCardDAOInt> implements CreditCardServiceInt{

}
