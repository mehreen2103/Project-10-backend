package com.rays.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;

/**
 * UserServiceImpl provides service layer implementation
 * for User module.
 * It handles user-related business operations like
 * authentication, registration, password management, etc.
 *
 * @author Mehreen
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<UserDTO, UserDAOInt> implements UserServiceInt {

	/**
	 * Finds user by login ID.
	 *
	 * @param login login ID
	 * @param userContext current user context
	 * @return matching UserDTO
	 */
	@Transactional(readOnly = true)
	public UserDTO findByLoginId(String login, UserContext userContext) {
		return baseDao.findByUniqueKey("loginId", login, userContext);
	}

	/**
	 * Registers a new user.
	 *
	 * @param dto user data
	 * @param userContext current user context
	 * @return registered user
	 */
	@Override
	public UserDTO register(UserDTO dto, UserContext userContext) {

		Long id = add(dto, userContext);
		
		EmailService.sendUserRegistration(dto.getLoginId(), dto.getPassword());

		dto.setId(id);

		return dto;
	}

	/**
	 * Authenticates user using loginId and password.
	 *
	 * @param loginId login ID
	 * @param password password
	 * @return authenticated user or null
	 */
	@Override
	public UserDTO authenticate(String loginId, String password) {

		UserDTO dto = findByLoginId(loginId, null);

		if (dto != null) {
			UserContext userContext = new UserContext(dto);

			if (password.equals(dto.getPassword())) {
				dto.setLastLogin(new Timestamp((new Date()).getTime()));
				dto.setUnsucessfullLoginAttempt(0);
				update(dto, userContext);
				return dto;
			} else {
				dto.setUnsucessfullLoginAttempt(1 + dto.getUnsucessfullLoginAttempt());
				update(dto, userContext);
			}
		}
		return null;
	}

	/**
	 * Handles forgot password functionality.
	 *
	 * @param loginId login ID
	 * @return user details or null
	 */
	@Override
	public UserDTO forgotPassword(String loginId) {

		UserDTO dto = findByLoginId(loginId, null);

		if (dto == null) {
			return null;
		}
		EmailService.sendForgotPasswordMail(dto.getLoginId(), dto.getPassword(), dto.getFirstName(), dto.getLastName());
		return dto;
	}

	/**
	 * Changes user password.
	 *
	 * @param loginId login ID
	 * @param oldPassword old password
	 * @param newPassword new password
	 * @param userContext current user context
	 * @return updated user or null
	 */
	@Override
	public UserDTO changePassword(String loginId, String oldPassword, String newPassword, UserContext userContext) {

		UserDTO dto = findByLoginId(loginId, null);

		if (dto != null && oldPassword.equals(dto.getPassword())) {
			dto.setPassword(newPassword);
			update(dto, userContext);
			EmailService.sendChangePasswordMail(dto.getLoginId(), dto.getPassword(), dto.getFirstName(), dto.getLastName());
			return dto;
		} else {
			return null;
		}
	}
}