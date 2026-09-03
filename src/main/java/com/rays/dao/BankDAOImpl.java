package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BankDTO;


@Repository
public class BankDAOImpl extends BaseDAOImpl<BankDTO>implements BankDAOInt{

	@Override
	public Class<BankDTO> getDTOClass() {
		
		return BankDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(BankDTO dto, CriteriaBuilder builder, Root<BankDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getBankName())) {
			whereCondition.add(builder.like(qRoot.get("bankName"), dto.getBankName() + "%"));
		}

		if (!isEmptyString(dto.getBranchName())) {
			whereCondition.add(builder.like(qRoot.get("branchName"), dto.getBranchName() + "%"));
		}

		if (!isEmptyString(dto.getIfscCode())) {
			whereCondition.add(builder.like(qRoot.get("ifscCode"), dto.getIfscCode() + "%"));
		}

		if (!isEmptyString(dto.getCity())) {
			whereCondition.add(builder.like(qRoot.get("city"), dto.getCity() + "%"));
		}
		return whereCondition;
	}
}