package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DroneDTO;

@Repository
public class DroneDAOImpl extends BaseDAOImpl<DroneDTO> implements DroneDAOInt{

	@Override
	public Class<DroneDTO> getDTOClass() {
		return DroneDTO.class;
		
	}

	@Override
	protected List<Predicate> getWhereClause(DroneDTO dto, CriteriaBuilder builder, Root<DroneDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getDroneCode())) {

			whereCondition.add(builder.like(qRoot.get("droneCode"), dto.getDroneCode() + "%"));
		}
		
		if (!isEmptyString(dto.getOperatorName())) {
			whereCondition.add(builder.like(qRoot.get("operatorName"),dto.getOperatorName() + "%") );
		}
		
		if (!isEmptyString(dto.getDeliveryZone())) {
			whereCondition.add(builder.like(qRoot.get("deliveryZone"),dto.getDeliveryZone() + "%") );
		}
		
		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"),dto.getStatus() + "%") );
		}
		return whereCondition;
		
		
		
		
	}

}
