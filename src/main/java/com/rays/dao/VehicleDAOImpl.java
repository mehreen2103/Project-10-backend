package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.VehicleDTO;

@Repository
public class VehicleDAOImpl extends BaseDAOImpl<VehicleDTO> implements VehicleDAOInt{

	@Override
	public Class<VehicleDTO> getDTOClass() {
		
		return VehicleDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(VehicleDTO dto, CriteriaBuilder builder, Root<VehicleDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getVehicleName())) {
			whereCondition.add(builder.like(qRoot.get("vehicleName"), dto.getVehicleName() + "%"));
		}

		if (!isEmptyString(dto.getModel())) {
			whereCondition.add(builder.like(qRoot.get("model"), dto.getModel() + "%"));
		}

		if (!isEmptyString(dto.getColor())) {
			whereCondition.add(builder.like(qRoot.get("color"), dto.getColor() + "%"));
		}

		if (!isEmptyString(dto.getPrice())) {
			whereCondition.add(builder.like(qRoot.get("price"), dto.getPrice() + "%"));
		}
		return whereCondition;
	}

}
