package com.rays.common;

/**
 * BaseForm is the base class for all form classes.
 * It contains common properties and utility methods
 * used for transferring form data to DTO objects.
 *
 * @author Mehreen
 */
public class BaseForm {

	/**
	 * Unique identifier of the record.
	 */
	protected Long id;

	/**
	 * User who created the record.
	 */
	protected String createdBy;

	/**
	 * User who last modified the record.
	 */
	protected String modifiedBy;

	/**
	 * Record creation timestamp.
	 */
	protected long createdDatetime;

	/**
	 * Record last modification timestamp.
	 */
	protected long modifiedDatetime;

	/**
	 * Array of selected record IDs.
	 */
	private Long[] ids;

	/**
	 * Current page number for pagination.
	 */
	private int pageNo = 0;

	/**
	 * Number of records per page.
	 */
	private int pageSize = 5;

	/**
	 * Current operation to be performed.
	 */
	private String operation;

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
	 * Converts the form into a DTO object.
	 * Child classes should override this method.
	 *
	 * @return DTO object
	 */
	public BaseDTO getDto() {
		return null;
	}

	/**
	 * Initializes the given DTO with the form ID.
	 *
	 * @param <T> DTO type
	 * @param dto DTO object
	 * @return initialized DTO
	 */
	public <T extends BaseDTO> T initDTO(T dto) {
		System.out.println("id => base dto => " + id);
		if (id != null && id > 0) {
			dto.setId(id);
		} else {
			dto.setId(null);
		}
		return dto;
	}
}