package com.rays.dto;

import java.io.IOException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import com.rays.common.BaseDTO;

/**
 * Data Transfer Object (DTO) representing an attachment.
 * <p>
 * This class stores attachment details such as name, type, description,
 * associated user, and the document content.
 * </p>
 *
 * @author Mehreen
 */
@Entity
@Table(name = "ST_ATTACHMENT")
public class AttachmentDTO extends BaseDTO {

	@Column(name = "NAME", length = 100)
	protected String name = null;

	@Column(name = "TYPE", length = 100)
	protected String type = null;

	@Column(name = "DESCRIPTION", length = 500)
	protected String description = null;

	@Column(name = "USER_ID")
	protected Long userId = null;

	@Lob
	@Column(name = "DOC")
	private byte[] doc;

	/**
	 * Default constructor.
	 */
	public AttachmentDTO() {
	}

	/**
	 * Creates an AttachmentDTO from the uploaded multipart file.
	 *
	 * @param file the uploaded file
	 */
	public AttachmentDTO(MultipartFile file) {
		name = file.getOriginalFilename();
		type = file.getContentType();

		try {
			doc = file.getBytes();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the attachment name.
	 *
	 * @return the attachment name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the attachment name.
	 *
	 * @param name the attachment name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the attachment type.
	 *
	 * @return the attachment type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the attachment type.
	 *
	 * @param type the attachment type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Returns the attachment description.
	 *
	 * @return the attachment description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the attachment description.
	 *
	 * @param description the attachment description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns the user ID associated with the attachment.
	 *
	 * @return the user ID
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * Sets the user ID associated with the attachment.
	 *
	 * @param userId the user ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * Returns the display value.
	 *
	 * @return the display value
	 */
	public String getValue() {
		return null;
	}

	/**
	 * Returns the document content.
	 *
	 * @return the document as a byte array
	 */
	public byte[] getDoc() {
		return doc;
	}

	/**
	 * Sets the document content.
	 *
	 * @param doc the document as a byte array
	 */
	public void setDoc(byte[] doc) {
		this.doc = doc;
	}

	/**
	 * Returns the unique key of the attachment.
	 *
	 * @return the unique key
	 */
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns the unique value of the attachment.
	 *
	 * @return the unique value
	 */
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns the label of the attachment.
	 *
	 * @return the label
	 */
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns the database table name.
	 *
	 * @return the table name
	 */
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return null;
	}
}