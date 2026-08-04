package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.UserDTO;

/**
 * UserServiceInt defines service layer operations
 * for User module.
 * It extends BaseServiceInt to inherit common CRUD operations.
 *
 * It also declares business operations like authentication,
 * registration and password management.
 *
 * @author Mehreen
 */
public interface UserServiceInt extends BaseServiceInt<UserDTO> {

	/**
	 * Finds user by login ID.
	 *
	 * @param name login ID
	 * @param userContext current user context
	 * @return matching UserDTO
	 */
	public UserDTO findByLoginId(String name, UserContext userContext);

	/**
	 * Registers a new user.
	 *
	 * @param dto user data
	 * @param userContext current user context
	 * @return registered user
	 */
	public UserDTO register(UserDTO dto, UserContext userContext);

	/**
	 * Authenticates a user using loginId and password.
	 *
	 * @param loginId login ID
	 * @param password password
	 * @return authenticated UserDTO or null
	 */
	public UserDTO authenticate(String loginId, String password);

	/**
	 * Handles forgot password request.
	 *
	 * @param loginId login ID
	 * @return user details or null
	 */
	public UserDTO forgotPassword(String loginId);

	/**
	 * Changes user password.
	 *
	 * @param loginId login ID
	 * @param oldPassword current password
	 * @param newPassword new password
	 * @param userContext current user context
	 * @return updated UserDTO or null
	 */
	public UserDTO changePassword(String loginId, String oldPassword, String newPassword, UserContext userContext);

}