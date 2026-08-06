package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.RoleDAOInt;
import com.rays.dto.RoleDTO;

/**
 * RoleServiceImpl provides service layer implementation
 * for Role module.
 * It extends BaseServiceImpl to reuse common CRUD operations.
 *
 * It also provides custom business methods for Role.
 *
 * @author Mehreen
 */
@Service
@Transactional
public class RoleServiceImpl extends BaseServiceImpl<RoleDTO, RoleDAOInt> implements RoleServiceInt {

	/**
	 * Finds a Role by its name.
	 *
	 * @param name role name
	 * @param userContext current user context
	 * @return RoleDTO matching role
	 */
	@Transactional(readOnly = true)
	public RoleDTO findByName(String name, UserContext userContext) {
		return baseDao.findByUniqueKey("name", name, userContext);
	}
}