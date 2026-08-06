package com.rays.common;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/**
 * BaseDTO is the base class for all DTO classes.
 * It contains common properties such as id,
 * audit information and abstract methods that
 * must be implemented by all child DTO classes.
 *
 * @author Mehreen
 */
@MappedSuperclass
public abstract class BaseDTO implements DropdownList {

	/**
	 * Unique identifier of the record.
	 */
	@Id
	@GeneratedValue(generator = "ncsPk")
	@GenericGenerator(name = "ncsPk", strategy = "native")
	@Column(name = "id", unique = true, nullable = false)
	protected Long id;

	/**
	 * User who created the record.
	 */
	@Column(name = "created_by", length = 50)
	protected String createdBy = "root";

	/**
	 * User who last modified the record.
	 */
	@Column(name = "modified_by", length = 50)
	protected String modifiedBy = "root";

	/**
	 * Date and time when the record was created.
	 */
	@Column(name = "created_datetime")
	protected Timestamp createdDatetime;

	/**
	 * Date and time when the record was last modified.
	 */
	@Column(name = "modified_datetime")
	protected Timestamp modifiedDatetime;

	/**
	 * Returns the unique key field name.
	 *
	 * @return unique key field
	 */
	public abstract String getUniqueKey();

	/**
	 * Returns the unique key value.
	 *
	 * @return unique key value
	 */
	public abstract String getUniqueValue();

	/**
	 * Returns the display label of the DTO.
	 *
	 * @return label
	 */
	public abstract String getLabel();

	/**
	 * Returns the database table name.
	 *
	 * @return table name
	 */
	public abstract String getTableName();

	/**
	 * Returns the record ID.
	 *
	 * @return record ID
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the record ID.
	 *
	 * @param id record ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Returns the creator name.
	 *
	 * @return created by
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * Sets the creator name.
	 *
	 * @param createdBy creator name
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * Returns the modifier name.
	 *
	 * @return modified by
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * Sets the modifier name.
	 *
	 * @param modifiedBy modifier name
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * Returns the created date and time.
	 *
	 * @return created datetime
	 */
	public Timestamp getCreatedDatetime() {
		return createdDatetime;
	}

	/**
	 * Sets the created date and time.
	 *
	 * @param createdDatetime created datetime
	 */
	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	/**
	 * Returns the modified date and time.
	 *
	 * @return modified datetime
	 */
	public Timestamp getModifiedDatetime() {
		return modifiedDatetime;
	}

	/**
	 * Sets the modified date and time.
	 *
	 * @param modifiedDatetime modified datetime
	 */
	public void setModifiedDatetime(Timestamp modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	/**
	 * Returns the record key.
	 *
	 * @return record key
	 */
	public String getKey() {
		return String.valueOf(id);
	}
}