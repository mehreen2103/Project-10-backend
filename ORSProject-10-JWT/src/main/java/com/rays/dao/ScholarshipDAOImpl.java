package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ScholarshipDTO;

@Repository
public class ScholarshipDAOImpl extends BaseDAOImpl<ScholarshipDTO> implements ScholarshipDAOInt {

	@Override
	public Class<ScholarshipDTO> getDTOClass() {
		
		return ScholarshipDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ScholarshipDTO dto, CriteriaBuilder builder, Root<ScholarshipDTO> qRoot) {
		
		 List<Predicate> whereCondition = new ArrayList<Predicate>();

	        if (!isEmptyString(dto.getScholarshipName())) {
	            whereCondition.add(builder.like(qRoot.get("scholarshipName"), dto.getScholarshipName() + "%"));
	        }

	        if (!isEmptyString(dto.getAmount())) {
	            whereCondition.add(builder.like(qRoot.get("amount"), dto.getAmount() + "%"));
	        }

	        if (!isEmptyString(dto.getEligibility())) {
	            whereCondition.add(builder.like(qRoot.get("eligibility"), dto.getEligibility() + "%"));
	        }
	        if (dto.getLastDate() != null) {
	            whereCondition.add(builder.equal(qRoot.get("lastDate"), dto.getLastDate()));
	        }


	        return whereCondition;
	}

}
