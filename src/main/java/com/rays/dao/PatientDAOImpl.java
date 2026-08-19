package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PatientDTO;

@Repository
public class PatientDAOImpl extends BaseDAOImpl<PatientDTO> implements PatientDAOInt {

	@Override
	public Class<PatientDTO> getDTOClass() {

		return PatientDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(PatientDTO dto, CriteriaBuilder builder, Root<PatientDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getPatientName())) {
			whereCondition.add(builder.like(qRoot.get("patientName"), dto.getPatientName() + "%"));
		}

		if (!isEmptyString(dto.getDisease())) {
			whereCondition.add(builder.like(qRoot.get("disease"), dto.getDisease() + "%"));
		}

		if (!isEmptyString(dto.getDoctorName())) {
			whereCondition.add(builder.like(qRoot.get("doctorName"), dto.getDoctorName() + "%"));
		}

		if (dto.getAdmissionDate() != null) {
		    whereCondition.add(builder.equal(qRoot.get("admissionDate"), dto.getAdmissionDate()));
		}
		return whereCondition;
	}

}
