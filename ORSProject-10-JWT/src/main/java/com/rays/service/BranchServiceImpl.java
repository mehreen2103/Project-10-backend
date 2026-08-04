package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BranchDAOInt;
import com.rays.dto.BranchDTO;

@Service
@Transactional
public class BranchServiceImpl extends BaseServiceImpl<BranchDTO, BranchDAOInt> implements BranchServiceInt{

}
