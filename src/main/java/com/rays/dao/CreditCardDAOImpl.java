package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CreditCardDTO;

@Repository
public class CreditCardDAOImpl extends BaseDAOImpl<CreditCardDTO> implements CreditCardDAOInt{

	@Override
	public Class<CreditCardDTO> getDTOClass() {
		
		return CreditCardDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(CreditCardDTO dto, CriteriaBuilder builder, Root<CreditCardDTO> qRoot) {

	    List<Predicate> whereCondition = new ArrayList<>();

	    if (!isEmptyString(dto.getCardNumber())) {
	        whereCondition.add(builder.like(qRoot.get("cardNumber"), dto.getCardNumber() + "%"));
	    }

	    if (!isEmptyString(dto.getCardholder())) {
	        whereCondition.add(builder.like(qRoot.get("cardholder"), dto.getCardholder() + "%"));
	    }

	    if (!isEmptyString(dto.getExpiryDate())) {
	        whereCondition.add(builder.like(qRoot.get("expiryDate"), dto.getExpiryDate() + "%"));
	    }

	    if (!isEmptyString(dto.getCardType())) {
	        whereCondition.add(builder.like(qRoot.get("cardType"), dto.getCardType() + "%"));
	    }

	    return whereCondition;
	}

}
