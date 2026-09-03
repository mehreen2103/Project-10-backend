package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;

import com.rays.dao.BankDAOInt;
import com.rays.dto.BankDTO;

@Service
@Transactional
public class BankServiceImpl extends BaseServiceImpl<BankDTO, BankDAOInt> implements BankServiceInt {

	

}