package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PaymentDAOInt;
import com.rays.dto.PaymentDTO;

@Service
@Transactional
public class PaymentServiceImpl extends BaseServiceImpl<PaymentDTO, PaymentDAOInt> implements PaymentServiceInt{

}
