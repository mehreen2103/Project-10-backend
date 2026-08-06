package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ATMDTO;

@Repository
public class ATMDAOImpl extends BaseDAOImpl<ATMDTO> implements ATMDAOInt{

	@Override
	public Class<ATMDTO> getDTOClass() {
		
		return ATMDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ATMDTO dto, CriteriaBuilder builder, Root<ATMDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		 if (!isEmptyString(dto.getLocation())) {
	            whereCondition.add(builder.like(qRoot.get("location"), dto.getLocation() + "%"));
	        }
		
		 if (!isEmptyString(dto.getBankName())) {
	            whereCondition.add(builder.like(qRoot.get("bankName"), dto.getBankName() + "%"));
	        }
		 
		 if (!isEmptyString(dto.getCashAvailable())) {
	            whereCondition.add(builder.like(qRoot.get("cashAvailable"), dto.getCashAvailable() + "%"));
	        }
		 
		 if (!isEmptyString(dto.getStatus())) {
	            whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
	        }
		return whereCondition;
	}

}
