package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LaptopDTO;

@Repository
public class LaptopDAOImpl extends BaseDAOImpl<LaptopDTO> implements LaptopDAOInt {

    @Override
    public Class<LaptopDTO> getDTOClass() {

        return LaptopDTO.class;
    }

    @Override
    protected List<Predicate> getWhereClause(LaptopDTO dto, CriteriaBuilder builder, Root<LaptopDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (!isEmptyString(dto.getBrandName())) {
            whereCondition.add(builder.like(qRoot.get("brandName"), dto.getBrandName() + "%"));
        }

        if (!isEmptyString(dto.getProcessor())) {
            whereCondition.add(builder.like(qRoot.get("processor"), dto.getProcessor() + "%"));
        }

        if (!isEmptyString(dto.getRam())) {
            whereCondition.add(builder.like(qRoot.get("ram"), dto.getRam() + "%"));
        }

        if (!isEmptyString(dto.getPrice())) {
            whereCondition.add(builder.like(qRoot.get("price"), dto.getPrice() + "%"));
        }

        return whereCondition;
    }
}