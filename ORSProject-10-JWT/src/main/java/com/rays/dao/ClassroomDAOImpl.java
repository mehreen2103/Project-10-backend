package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ClassroomDTO;

@Repository
public class ClassroomDAOImpl extends BaseDAOImpl<ClassroomDTO> implements ClassroomDAOInt{

	@Override
	public Class<ClassroomDTO> getDTOClass() {
		
		return ClassroomDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ClassroomDTO dto, CriteriaBuilder builder, Root<ClassroomDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		 if (!isEmptyString(dto.getRoomNumber())) {
	            whereCondition.add(builder.like(qRoot.get("roomNumber"), dto.getRoomNumber() + "%"));
	        }
		
		 if (!isEmptyString(dto.getFloor())) {
	            whereCondition.add(builder.like(qRoot.get("floor"), dto.getFloor() + "%"));
	        }
		 
		 if (!isEmptyString(dto.getCapacity())) {
	            whereCondition.add(builder.like(qRoot.get("capacity"), dto.getCapacity() + "%"));
	        }
		 
		 if (!isEmptyString(dto.getBuildingName())) {
	            whereCondition.add(builder.like(qRoot.get("buildingName"), dto.getBuildingName() + "%"));
	        }
		return whereCondition;
	}

}
