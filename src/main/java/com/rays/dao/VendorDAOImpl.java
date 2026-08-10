package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.VendorDTO;

@Repository
public class VendorDAOImpl extends BaseDAOImpl<VendorDTO> implements VendorDAOInt{

	@Override
	public Class<VendorDTO> getDTOClass() {
		
		return VendorDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(VendorDTO dto, CriteriaBuilder builder, Root<VendorDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<>();

	    if (!isEmptyString(dto.getVendorName())) {
	        whereCondition.add(builder.like(qRoot.get("vendorName"), dto.getVendorName() + "%"));
	    }

	    if (!isEmptyString(dto.getMobileNo())) {
	        whereCondition.add(builder.like(qRoot.get("mobileNo"), dto.getMobileNo() + "%"));
	    }

	    if (!isEmptyString(dto.getAddress())) {
	        whereCondition.add(builder.like(qRoot.get("address"), dto.getAddress() + "%"));
	    }

	    if (!isEmptyString(dto.getServiceType())) {
	        whereCondition.add(builder.like(qRoot.get("serviceType"), dto.getServiceType() + "%"));
	    }

	    return whereCondition;
	}

}
