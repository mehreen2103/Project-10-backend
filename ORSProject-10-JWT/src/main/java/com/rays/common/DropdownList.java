package com.rays.common;

/**
 * DropdownList is an interface used to provide
 * key-value pairs for dropdown components.
 *
 * @author Mehreen
 */
public interface DropdownList {

	/**
	 * Returns the key of the dropdown item.
	 *
	 * @return dropdown key
	 */
	public String getKey();

	/**
	 * Returns the value of the dropdown item.
	 *
	 * @return dropdown value
	 */
	public String getValue();

}