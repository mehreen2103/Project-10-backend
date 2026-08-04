package com.rays.common;

import com.rays.dto.UserDTO;

/**
 * UserContext stores information about the currently logged-in user.
 * It is used throughout the application to access user-related
 * details such as user ID, login ID, name and role information.
 *
 * @author Mehreen
 */
public class UserContext {

	/**
	 * Unique ID of the logged-in user.
	 */
	private Long userId = 0L;

	/**
	 * Login ID of the user.
	 */
	private String loginId = "root";

	/**
	 * Name of the user.
	 */
	private String name = null;

	/**
	 * Role ID of the user.
	 */
	private Long roleId = 0L;

	/**
	 * Role name of the user.
	 */
	private String roleName = "root";

	/**
	 * UserDTO containing complete user information.
	 */
	private UserDTO userDTO = null;

	/**
	 * Default constructor.
	 */
	public UserContext() {
	}

	/**
	 * Creates a UserContext from the given UserDTO.
	 *
	 * @param dto UserDTO containing user information
	 */
	public UserContext(UserDTO dto) {
		this.userDTO = dto;
		this.userId = dto.getId();
		this.loginId = dto.getLoginId();
		this.name = dto.getName();
		this.roleId = dto.getRoleId();
		this.roleName = dto.getRoleName();
	}

	/**
	 * Returns the user ID.
	 *
	 * @return user ID
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * Sets the user ID.
	 *
	 * @param userId user ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * Returns the login ID.
	 *
	 * @return login ID
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * Sets the login ID.
	 *
	 * @param loginId login ID
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * Returns the user's name.
	 *
	 * @return user name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the user's name.
	 *
	 * @param name user name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the role ID.
	 *
	 * @return role ID
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * Sets the role ID.
	 *
	 * @param roleId role ID
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * Returns the role name.
	 *
	 * @return role name
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * Sets the role name.
	 *
	 * @param roleName role name
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * Returns the UserDTO.
	 *
	 * @return UserDTO object
	 */
	public UserDTO getUserDTO() {
		return userDTO;
	}

	/**
	 * Sets the UserDTO.
	 *
	 * @param userDTO UserDTO object
	 */
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
}