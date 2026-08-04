package com.rays.common;

import java.util.List;

/**
 * BaseServiceInt defines the common business service operations
 * for all DTO classes.
 *
 * @param <T> DTO type
 *
 * @author Mehreen
 */
public interface BaseServiceInt<T extends BaseDTO> {

	/**
	 * Adds a new record.
	 *
	 * @param dto DTO object
	 * @param userContext current user context
	 * @return generated primary key
	 */
	public long add(T dto, UserContext userContext);

	/**
	 * Updates an existing record.
	 *
	 * @param dto DTO object
	 * @param userContext current user context
	 */
	public void update(T dto, UserContext userContext);

	/**
	 * Saves a record by performing add or update operation.
	 *
	 * @param dto DTO object
	 * @param userContext current user context
	 * @return record ID
	 */
	public long save(T dto, UserContext userContext);

	/**
	 * Deletes a record by its ID.
	 *
	 * @param id record ID
	 * @param userContext current user context
	 * @return deleted DTO
	 */
	public T delete(long id, UserContext userContext);

	/**
	 * Finds a record by its ID.
	 *
	 * @param id record ID
	 * @param userContext current user context
	 * @return matching DTO
	 */
	public T findById(long id, UserContext userContext);

	/**
	 * Finds a record using a unique field.
	 *
	 * @param attribute unique field name
	 * @param val unique field value
	 * @param userContext current user context
	 * @return matching DTO
	 */
	public T findByUniqueKey(String attribute, String val, UserContext userContext);

	/**
	 * Searches records with pagination.
	 *
	 * @param dto DTO containing search criteria
	 * @param pageNo page number
	 * @param pageSize page size
	 * @param userContext current user context
	 * @return list of matching records
	 */
	public List search(T dto, int pageNo, int pageSize, UserContext userContext);

	/**
	 * Searches all matching records.
	 *
	 * @param dto DTO containing search criteria
	 * @param userContext current user context
	 * @return list of matching records
	 */
	public List search(T dto, UserContext userContext);

}