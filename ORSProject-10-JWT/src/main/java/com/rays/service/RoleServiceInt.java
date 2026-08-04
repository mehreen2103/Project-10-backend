package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.RoleDTO;

/**
 * RoleServiceInt defines service layer operations
 * for Role module.
 * It extends BaseServiceInt to inherit common CRUD operations.
 *
 * It also declares custom business methods for Role.
 *
 * @author Mehreen
 */
public interface RoleServiceInt extends BaseServiceInt<RoleDTO> {

	/**
	 * Finds a Role by its name.
	 *
	 * @param name role name
	 * @param userContext current user context
	 * @return RoleDTO matching role
	 */
	public RoleDTO findByName(String name, UserContext userContext);

}