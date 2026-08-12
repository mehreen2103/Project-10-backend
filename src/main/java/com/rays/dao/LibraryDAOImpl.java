package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LibraryDTO;

@Repository
public class LibraryDAOImpl extends BaseDAOImpl<LibraryDTO> implements LibraryDAOInt{

	@Override
	public Class<LibraryDTO> getDTOClass() {
		
		return LibraryDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(LibraryDTO dto, CriteriaBuilder builder, Root<LibraryDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<>();

	    if (!isEmptyString(dto.getLibraryName())) {
	        whereCondition.add(builder.like(qRoot.get("libraryName"), dto.getLibraryName() + "%"));
	    }

	    if (!isEmptyString(dto.getAddress())) {
	        whereCondition.add(builder.like(qRoot.get("address"), dto.getAddress() + "%"));
	    }

	    if (!isEmptyString(dto.getTotalBooks())) {
	        whereCondition.add(builder.like(qRoot.get("totalBooks"), dto.getTotalBooks() + "%"));
	    }


	    if (!isEmptyString(dto.getContactNo())) {
	        whereCondition.add(builder.like(qRoot.get("contactNo"), dto.getContactNo() + "%"));
	    }

	    return whereCondition;
	}

}
