package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ComplaintDTO;

@Repository
public class ComplaintDAOImpl extends BaseDAOImpl<ComplaintDTO> implements ComplaintDAOInt{

	@Override
	public Class<ComplaintDTO> getDTOClass() {
		
		return ComplaintDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ComplaintDTO dto, CriteriaBuilder builder, Root<ComplaintDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<>();

	    if (!isEmptyString(dto.getComplaintType())) {
	        whereCondition.add(builder.like(qRoot.get("complaintType"), dto.getComplaintType() + "%"));
	    }

	    if (!isEmptyString(dto.getDescription())) {
	        whereCondition.add(builder.like(qRoot.get("description"), dto.getDescription() + "%"));
	    }

	    if (dto.getComplaintDate() != null) {
            whereCondition.add(builder.equal(qRoot.get("compalaintDate"), dto.getComplaintDate()));
        }

	    if (!isEmptyString(dto.getStatus())) {
	        whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
	    }

	    return whereCondition;
		
	}

}
