package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.FeeDTO;

@Repository
public class FeeDAOImpl extends BaseDAOImpl<FeeDTO> implements FeeDAOInt {

    @Override
    public Class<FeeDTO> getDTOClass() {

        return FeeDTO.class;
    }

    @Override
    protected List<Predicate> getWhereClause(FeeDTO dto, CriteriaBuilder builder, Root<FeeDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<Predicate>();

        if (!isEmptyString(dto.getStudentName())) {
            whereCondition.add(builder.like(qRoot.get("studentName"), dto.getStudentName() + "%"));
        }

        if (!isEmptyString(dto.getAmount())) {
            whereCondition.add(builder.like(qRoot.get("amount"), dto.getAmount() + "%"));
        }

        if (dto.getPaymentDate() != null) {
            whereCondition.add(builder.equal(qRoot.get("paymentDate"), dto.getPaymentDate()));
        }

        if (!isEmptyString(dto.getPaymentStatus())) {
            whereCondition.add(builder.like(qRoot.get("paymentStatus"), dto.getPaymentStatus() + "%"));
        }

        return whereCondition;
    }

}