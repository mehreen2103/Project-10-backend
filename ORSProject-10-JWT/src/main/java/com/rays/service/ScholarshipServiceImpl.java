package com.rays.service;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.rays.common.BaseServiceImpl;
import com.rays.dao.ScholarshipDAOInt;
import com.rays.dto.ScholarshipDTO;

@Service
@Transactional
public class ScholarshipServiceImpl extends BaseServiceImpl<ScholarshipDTO, ScholarshipDAOInt> implements ScholarshipServiceInt{

}
