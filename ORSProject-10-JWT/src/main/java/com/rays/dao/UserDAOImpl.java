package com.rays.dao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.RoleDTO;
import com.rays.dto.UserDTO;

/**
 * DAO implementation class for {@link UserDTO}.
 * <p>
 * This class extends {@code BaseDAOImpl} and provides database
 * operations for User entities.
 * </p>
 *
 * @author Mehreen
 */
@Repository
public class UserDAOImpl extends BaseDAOImpl<UserDTO> implements UserDAOInt {

	@Autowired
	RoleDAOInt roleDao;

	/**
	 * Returns the DTO class managed by this DAO.
	 *
	 * @return the {@link UserDTO} class
	 */
	@Override
	public Class<UserDTO> getDTOClass() {
		return UserDTO.class;
	}

	/**
	 * Populates the user DTO with related role, last login,
	 * and profile image information.
	 *
	 * @param dto the user DTO
	 * @param userContext the current user context
	 */
	@Override
	protected void populate(UserDTO dto, UserContext userContext) {

		if (dto.getRoleId() != null && dto.getRoleId() > 0) {
			RoleDTO roleDTO = roleDao.findByPK(dto.getRoleId(), userContext);
			if (roleDTO != null) {
				dto.setRoleName(roleDTO.getName());
			}
		}
		if (dto.getId() != null && dto.getId() > 0) {
			UserDTO user = findByPK(dto.getId(), userContext);
			if (user != null) {
				dto.setLastLogin(user.getLastLogin());
			}
		}
		if (dto.getId() != null && dto.getId() > 0) {
			UserDTO userData = findByPK(dto.getId(), null);
			if (userData != null) {
				dto.setImageId(userData.getImageId());
			}
		}
	}

	/**
	 * Builds the WHERE clause predicates based on the search criteria.
	 *
	 * @param dto the user search criteria
	 * @param builder the criteria builder
	 * @param qRoot the query root
	 * @return the list of predicates
	 */
	@Override
	protected List<Predicate> getWhereClause(UserDTO dto, CriteriaBuilder builder, Root<UserDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getFirstName())) {

			whereCondition.add(builder.like(qRoot.get("firstName"), dto.getFirstName() + "%"));
		}
		if (!isEmptyString(dto.getLoginId())) {

			whereCondition.add(builder.like(qRoot.get("loginId"), dto.getLoginId() + "%"));
		}
		if (!isZeroNumber(dto.getRoleId())) {

			whereCondition.add(builder.equal(qRoot.get("roleId"), dto.getRoleId()));
		}
		if (isNotNull(dto.getDob())) {

			whereCondition.add(builder.equal(qRoot.get("dob"), dto.getDob()));
		}
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.equal(qRoot.get("status"), dto.getStatus()));
		}
		return whereCondition;
	}
}