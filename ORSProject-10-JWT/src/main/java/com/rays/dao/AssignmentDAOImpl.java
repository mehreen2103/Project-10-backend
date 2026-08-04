package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AssignmentDTO;

@Repository
public class AssignmentDAOImpl extends BaseDAOImpl<AssignmentDTO> implements AssignmentDAOInt{

	@Override
	public Class<AssignmentDTO> getDTOClass() {
		
		return AssignmentDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(AssignmentDTO dto, CriteriaBuilder builder, Root<AssignmentDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		 if (!isEmptyString(dto.getTitle())) {
	            whereCondition.add(builder.like(qRoot.get("title"), dto.getTitle() + "%"));
	        }
		
		 if (dto.getDueDate() != null) {
	            whereCondition.add(builder.equal(qRoot.get("dueDate"), dto.getDueDate()));
	        }
		 
		 if (!isEmptyString(dto.getSubject())) {
	            whereCondition.add(builder.like(qRoot.get("subject"), dto.getSubject() + "%"));
	        }
		 
		 if (!isEmptyString(dto.getMarks())) {
	            whereCondition.add(builder.like(qRoot.get("marks"), dto.getMarks() + "%"));
	        }
		return whereCondition;
	}

}
