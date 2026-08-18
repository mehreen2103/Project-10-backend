package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BookDTO;

@Repository
public class BookDAOImpl extends BaseDAOImpl<BookDTO> implements BookDAOInt{

	@Override
	public Class<BookDTO> getDTOClass() {
		
	return BookDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(BookDTO dto, CriteriaBuilder builder, Root<BookDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<>();

	    if (!isEmptyString(dto.getTitle())) {
	        whereCondition.add(builder.like(qRoot.get("title"), dto.getTitle()+ "%"));
	    }

	    if (!isEmptyString(dto.getAuthor())) {
	        whereCondition.add(builder.like(qRoot.get("author"), dto.getAuthor() + "%"));
	    }

	    if (!isEmptyString(dto.getPrice())) {
	        whereCondition.add(builder.like(qRoot.get("price"), dto.getPrice() + "%"));
	    }


	    if (!isEmptyString(dto.getPublicationYear())) {
	        whereCondition.add(builder.like(qRoot.get("publicationYear"), dto.getPublicationYear() + "%"));
	    }

	    return whereCondition;
	}

}
