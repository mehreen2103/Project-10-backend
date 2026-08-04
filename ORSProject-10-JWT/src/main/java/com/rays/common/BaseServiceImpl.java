package com.rays.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.exception.DatabaseException;
import com.rays.exception.DuplicateRecordException;

/**
 * BaseServiceImpl is a generic service implementation that provides
 * common business operations for all modules.
 * It delegates database operations to the corresponding DAO layer.
 *
 * @param <T> DTO type
 * @param <D> DAO type
 *
 * @author Mehreen
 */
public class BaseServiceImpl<T extends BaseDTO, D extends BaseDAOInt<T>> implements BaseServiceInt<T> {

	/**
	 * DAO instance used for database operations.
	 */
	@Autowired
	protected D baseDao;

	/**
	 * Adds a new record.
	 *
	 * @param dto DTO object
	 * @param userContext current user context
	 * @return generated primary key
	 * @throws DuplicateRecordException if duplicate record exists
	 */
	@Transactional(readOnly = false)
	public long add(T dto, UserContext userContext) throws DuplicateRecordException {
		long pk = baseDao.add(dto, userContext);
		return pk;
	}

	/**
	 * Updates an existing record.
	 *
	 * @param dto DTO object
	 * @param userContext current user context
	 * @throws DuplicateRecordException if duplicate record exists
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public void update(T dto, UserContext userContext) throws DuplicateRecordException {

		T oldDto = baseDao.findByPK(dto.getId(), userContext);

		if (oldDto != null) {
			dto.setCreatedBy(oldDto.getCreatedBy());
			dto.setCreatedDatetime(oldDto.getCreatedDatetime());
		}

		baseDao.update(dto, userContext);
	}

	/**
	 * Saves the record by performing add or update operation.
	 *
	 * @param dto DTO object
	 * @param userContext current user context
	 * @return record ID
	 * @throws DuplicateRecordException if duplicate record exists
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public long save(T dto, UserContext userContext) throws DuplicateRecordException {
		Long id = dto.getId();
		if (id != null && id > 0) {
			update(dto, userContext);
		} else {
			id = add(dto, userContext);
		}
		return id;
	}

	/**
	 * Finds a record by its ID.
	 *
	 * @param id record ID
	 * @param userContext current user context
	 * @return matching DTO
	 */
	@Transactional(readOnly = true)
	public T findById(long id, UserContext userContext) {
		T dto = baseDao.findByPK(id, userContext);
		return dto;
	}

	/**
	 * Deletes a record by its ID.
	 *
	 * @param id record ID
	 * @param userContext current user context
	 * @return deleted DTO
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public T delete(long id, UserContext userContext) {
		T dto = findById(id, userContext);
		if (dto == null) {
			throw new DatabaseException("Record not found");
		}
		baseDao.delete(dto, userContext);
		return dto;
	}

	/**
	 * Finds a record using a unique field.
	 *
	 * @param attribute unique field name
	 * @param val unique field value
	 * @param userContext current user context
	 * @return matching DTO
	 */
	@Transactional(readOnly = true)
	public T findByUniqueKey(String attribute, String val, UserContext userContext) {
		T dto = baseDao.findByUniqueKey(attribute, val, userContext);
		return dto;
	}

	/**
	 * Searches records with pagination.
	 *
	 * @param dto DTO containing search criteria
	 * @param pageNo page number
	 * @param pageSize page size
	 * @param userContext current user context
	 * @return list of matching records
	 */
	@Transactional(readOnly = true)
	public List<T> search(T dto, int pageNo, int pageSize, UserContext userContext) {
		return baseDao.search(dto, pageNo, pageSize, userContext);
	}

	/**
	 * Searches all matching records.
	 *
	 * @param dto DTO containing search criteria
	 * @param userContext current user context
	 * @return list of matching records
	 */
	@Transactional(readOnly = true)
	public List<T> search(T dto, UserContext userContext) {
		return baseDao.search(dto, userContext);
	}
}