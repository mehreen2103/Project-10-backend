package com.rays.common;

import java.util.List;

/**
 * BaseDAOInt defines the common database operations
 * for all DAO implementations.
 *
 * @param <T> DTO type
 * 
 * @author Mehreen
 */
public interface BaseDAOInt<T extends BaseDTO> {

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
	 * Deletes a record.
	 *
	 * @param dto DTO object
	 * @param userContext current user context
	 */
	public void delete(T dto, UserContext userContext);

	/**
	 * Finds a record by its primary key.
	 *
	 * @param pk primary key
	 * @param userContext current user context
	 * @return matching DTO
	 */
	public T findByPK(long pk, UserContext userContext);

	/**
	 * Finds a record using a unique field.
	 *
	 * @param attribute unique field name
	 * @param val unique field value
	 * @param userContext current user context
	 * @return matching DTO
	 */
	public T findByUniqueKey(String attribute, Object val, UserContext userContext);

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