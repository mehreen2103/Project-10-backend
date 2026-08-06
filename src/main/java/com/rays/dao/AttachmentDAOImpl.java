package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AttachmentDTO;

/**
 * DAO implementation class for {@link AttachmentDTO}.
 * <p>
 * This class extends {@code BaseDAOImpl} and provides database
 * operations for Attachment entities.
 * </p>
 *
 * @author Mehreen
 */
@Repository
public class AttachmentDAOImpl extends BaseDAOImpl<AttachmentDTO> implements AttachmentDAOInt {

	/**
	 * Returns the DTO class managed by this DAO.
	 *
	 * @return the {@link AttachmentDTO} class
	 */
	@Override
	public Class<AttachmentDTO> getDTOClass() {
		return AttachmentDTO.class;
	}

	/**
	 * Builds the WHERE clause predicates for searching Attachment records.
	 *
	 * @param dto the attachment search criteria
	 * @param builder the criteria builder
	 * @param qRoot the query root
	 * @return the list of predicates
	 */
	@Override
	protected List<Predicate> getWhereClause(AttachmentDTO dto, CriteriaBuilder builder, Root<AttachmentDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		return whereCondition;
	}

}