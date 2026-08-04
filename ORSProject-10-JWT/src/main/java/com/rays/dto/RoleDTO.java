package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * Data Transfer Object (DTO) representing a Role.
 * <p>
 * This class stores role-related information such as
 * role name and description.
 * </p>
 *
 * @author Mehreen
 */
@Entity
@Table(name = "st_role")
public class RoleDTO extends BaseDTO {

	@Column(name = "name", length = 50)
	private String name = null;

	@Column(name = "description", length = 100)
	private String description = null;

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
	 * Returns the unique key used to identify the role.
	 *
	 * @return the unique key
	 */
	@Override
	public String getUniqueKey() {
		return "name";
	}

	/**
	 * Returns the unique value of the role.
	 *
	 * @return the role name
	 */
	@Override
	public String getUniqueValue() {
		return name;
	}

	/**
	 * Returns the display label.
	 *
	 * @return the label
	 */
	@Override
	public String getLabel() {
		return "Role Name";
	}

	/**
	 * Returns the database table name.
	 *
	 * @return the table name
	 */
	@Override
	public String getTableName() {
		return "Role";
	}

	/**
	 * Returns the display value.
	 *
	 * @return the role name
	 */
	@Override
	public String getValue() {
		return name;
	}
}