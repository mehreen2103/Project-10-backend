package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.RoleDTO;

/**
 * Form class for Role.
 * <p>
 * This form is used to capture and validate role-related data
 * before converting it into a {@link RoleDTO}.
 * </p>
 *
 * @author Mehreen
 */
public class RoleForm extends BaseForm {

	/**
	 * Constant representing the Administrator role.
	 */
	public static final int ADMIN = 1;

	/**
	 * Constant representing the Student role.
	 */
	public static final int STUDENT = 2;

	/**
	 * Constant representing the Faculty role.
	 */
	public static final int FACULTY = 3;

	/**
	 * Constant representing the Kiosk role.
	 */
	public static final int KIOSK = 4;

	@NotEmpty(message = "Name is required")
	private String name;

	@NotEmpty(message = "Description is required")
	private String description;

	/**
	 * Returns the role name.
	 *
	 * @return the role name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the role name.
	 *
	 * @param name the role name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the role description.
	 *
	 * @return the role description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the role description.
	 *
	 * @param description the role description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Converts this form into a {@link RoleDTO}.
	 *
	 * @return the populated RoleDTO object
	 */
	@Override
	public BaseDTO getDto() {
		RoleDTO dto = initDTO(new RoleDTO());
		dto.setDescription(description);
		dto.setName(name);
		return dto;
	}
}