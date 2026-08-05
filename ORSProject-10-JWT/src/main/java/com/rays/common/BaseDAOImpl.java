package com.rays.common;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * BaseDAOImpl is a generic DAO implementation that provides common
 * database operations for all DTO classes using JPA.
 *
 * @param <T> DTO type
 *
 * @author Mehreen
 */
public abstract class BaseDAOImpl<T extends BaseDTO> implements BaseDAOInt<T> {

	/**
	 * EntityManager used for database operations.
	 */
	@PersistenceContext
	protected EntityManager entityManager;

	/**
	 * Sets the EntityManager.
	 *
	 * @param entityManager the EntityManager instance
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * Returns the DTO class.
	 *
	 * @return DTO class
	 */
	public abstract Class<T> getDTOClass();

	/**
	 * Creates the where clause predicates for search operations.
	 *
	 * @param dto DTO containing search criteria
	 * @param builder CriteriaBuilder instance
	 * @param qRoot query root
	 * @return list of predicates
	 */
	protected abstract List<Predicate> getWhereClause(T dto, CriteriaBuilder builder, Root<T> qRoot);

	/**
	 * Populates additional DTO fields before persisting or updating.
	 *
	 * @param dto DTO object
	 * @param userContext current user context
	 */
	protected void populate(T dto, UserContext userContext) {
	}

	/**
	 * Adds a new record to the database.
	 *
	 * @param dto DTO object
	 * @param userContext current user context
	 * @return generated primary key
	 */
	public long add(T dto, UserContext userContext) {

		dto.setCreatedBy(userContext.getLoginId());
		dto.setCreatedDatetime(new Timestamp(new Date().getTime()));
		dto.setModifiedBy(userContext.getLoginId());
		dto.setModifiedDatetime(new Timestamp(new Date().getTime()));

		populate(dto, userContext);

		entityManager.persist(dto);

		return dto.getId();
	}

	/**
	 * Updates an existing record.
	 *
	 * @param dto DTO object
	 * @param userContext current user context
	 */
	public void update(T dto, UserContext userContext) {

		dto.setModifiedBy(userContext.getLoginId());
		dto.setModifiedDatetime(new Timestamp(new Date().getTime()));

		populate(dto, userContext);

		entityManager.merge(dto);
	}

	/**
	 * Deletes a record from the database.
	 *
	 * @param dto DTO object
	 * @param userContext current user context
	 */
	public void delete(T dto, UserContext userContext) {
		entityManager.remove(dto);
	}

	/**
	 * Finds a record by primary key.
	 *
	 * @param pk primary key
	 * @param userContext current user context
	 * @return matching DTO
	 */
	public T findByPK(long pk, UserContext userContext) {
		T dto = entityManager.find(getDTOClass(), pk);
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
	public T findByUniqueKey(String attribute, Object val, UserContext userContext) {

		Class<T> dtoClass = getDTOClass();

		CriteriaBuilder builder = entityManager.getCriteriaBuilder();    //Criteria Builder Object

		CriteriaQuery<T> cq = builder.createQuery(dtoClass);

		Root<T> qRoot = cq.from(dtoClass);

		Predicate condition = builder.equal(qRoot.get(attribute), val);

		cq.where(condition);

		TypedQuery<T> query = entityManager.createQuery(cq);

		List<T> list = query.getResultList();

		T dto = null;

		if (list.size() > 0) {
			dto = list.get(0);
		}

		return dto;
	}

	/**
	 * Creates a criteria query for searching records.
	 *
	 * @param dto DTO containing search criteria
	 * @param userContext current user context
	 * @return typed query
	 */
	protected TypedQuery<T> createCriteria(T dto, UserContext userContext) {

		CriteriaBuilder builder = entityManager.getCriteriaBuilder();

		CriteriaQuery<T> cq = builder.createQuery(getDTOClass());

		Root<T> qRoot = cq.from(getDTOClass());

		cq.select(qRoot);

		List<Predicate> whereClause = getWhereClause(dto, builder, qRoot);

		cq.where(whereClause.toArray(new Predicate[whereClause.size()])); //this line is not imp to tell sir

		TypedQuery<T> query = entityManager.createQuery(cq);

		return query;
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
	public List search(T dto, int pageNo, int pageSize, UserContext userContext) {

		TypedQuery<T> query = createCriteria(dto, userContext);

		if (pageSize > 0) {
			query.setFirstResult(pageNo * pageSize);
			query.setMaxResults(pageSize);
		}

		List list = query.getResultList();
		return list;
	}

	/**
	 * Returns the top 10 records for marksheet merit list.
	 *
	 * @param hql HQL query
	 * @param userContext current user context
	 * @return merit list records
	 */
	public List marksheetMeritList(String hql, UserContext userContext) {
		Query q = entityManager.createQuery(hql);
		q.setFirstResult(0);
		q.setMaxResults(10);
		List l = q.getResultList();
		return l;
	}

	/**
	 * Searches all matching records without pagination.
	 *
	 * @param dto DTO containing search criteria
	 * @param userContext current user context
	 * @return list of matching records
	 */
	public List search(T dto, UserContext userContext) {
		return search(dto, 0, 0, userContext);
	}

	/**
	 * Checks whether the given string is null or empty.
	 *
	 * @param val string value
	 * @return true if null or empty, otherwise false
	 */
	protected boolean isEmptyString(String val) {
		return val == null || val.trim().length() == 0;
	}

	/**
	 * Checks whether the given Double value is null or zero.
	 *
	 * @param val Double value
	 * @return true if null or zero, otherwise false
	 */
	protected boolean isZeroNumber(Double val) {
		return val == null || val == 0;
	}

	/**
	 * Checks whether the given Long value is null or zero.
	 *
	 * @param val Long value
	 * @return true if null or zero, otherwise false
	 */
	protected boolean isZeroNumber(Long val) {
		return val == null || val == 0;
	}

	/**
	 * Checks whether the given Integer value is null or zero.
	 *
	 * @param val Integer value
	 * @return true if null or zero, otherwise false
	 */
	protected boolean isZeroNumber(Integer val) {
		return val == null || val == 0;
	}

	/**
	 * Checks whether the given object is not null.
	 *
	 * @param val object value
	 * @return true if object is not null, otherwise false
	 */
	protected boolean isNotNull(Object val) {
		return val != null;
	}
}