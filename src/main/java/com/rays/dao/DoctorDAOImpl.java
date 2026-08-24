package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DoctorDTO;

@Repository
public class DoctorDAOImpl extends BaseDAOImpl<DoctorDTO> implements DoctorDAOInt{

	@Override
	public Class<DoctorDTO> getDTOClass() {
		
		return DoctorDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(DoctorDTO dto, CriteriaBuilder builder, Root<DoctorDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getDoctorName())) {
			whereCondition.add(builder.like(qRoot.get("doctorName"), dto.getDoctorName() + "%"));
		}

		if (!isEmptyString(dto.getSpecialization())) {
			whereCondition.add(builder.like(qRoot.get("specialization"), dto.getSpecialization() + "%"));
		}

		if (!isEmptyString(dto.getExperience())) {
			whereCondition.add(builder.like(qRoot.get("experience"), dto.getExperience() + "%"));
		}

		if (!isEmptyString(dto.getContactNo())) {
			whereCondition.add(builder.like(qRoot.get("contactNo"), dto.getContactNo() + "%"));
		}
		return whereCondition;
	}

}
