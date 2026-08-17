package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PaymentDTO;

@Repository
public class PaymentDAOImpl extends BaseDAOImpl<PaymentDTO> implements PaymentDAOInt{

	@Override
	public Class<PaymentDTO> getDTOClass() {
		
		return PaymentDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(PaymentDTO dto, CriteriaBuilder builder, Root<PaymentDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<>();

	    if (!isEmptyString(dto.getAmount())) {
	        whereCondition.add(builder.like(qRoot.get("amount"), dto.getAmount()+ "%"));
	    }

	    if (!isEmptyString(dto.getPaymentDate())) {
	        whereCondition.add(builder.like(qRoot.get("paymentDate"), dto.getPaymentDate() + "%"));
	    }

	    if (!isEmptyString(dto.getPaymentMethod())) {
	        whereCondition.add(builder.like(qRoot.get("paymentMethod"), dto.getPaymentMethod() + "%"));
	    }


	    if (!isEmptyString(dto.getTransactionId())) {
	        whereCondition.add(builder.like(qRoot.get("transactionId"), dto.getTransactionId() + "%"));
	    }

	    return whereCondition;
	}

}
