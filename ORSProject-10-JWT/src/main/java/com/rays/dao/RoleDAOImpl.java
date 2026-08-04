package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RoleDTO;

/**
 * DAO implementation class for {@link RoleDTO}.
 * <p>
 * This class extends {@code BaseDAOImpl} and provides database
 * operations for Role entities.
 * </p>
 *
 * @author Mehreen
 */
@Repository
public class RoleDAOImpl extends BaseDAOImpl<RoleDTO> implements RoleDAOInt {

	/**
	 * Returns the DTO class managed by this DAO.
	 *
	 * @return the {@link RoleDTO} class
	 */
	@Override
	public Class<RoleDTO> getDTOClass() {
		return RoleDTO.class;
	}

	/**
	 * Builds the WHERE clause predicates based on the search criteria.
	 *
	 * @param dto the role search criteria
	 * @param builder the criteria builder
	 * @param qRoot the query root
	 * @return the list of predicates
	 */
	@Override
	protected List<Predicate> getWhereClause(RoleDTO dto, CriteriaBuilder builder, Root<RoleDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isZeroNumber(dto.getId())) {

			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		return whereCondition;
	}
}