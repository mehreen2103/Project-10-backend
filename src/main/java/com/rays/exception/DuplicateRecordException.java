package com.rays.exception;

/**
 * Exception thrown when an attempt is made to create or save
 * a record that already exists in the database.
 * <p>
 * This exception extends {@link RuntimeException} and is used
 * to indicate duplicate record errors.
 * </p>
 *
 * @author Mehreen
 */
public class DuplicateRecordException extends RuntimeException {

	/**
	 * Constructs a new DuplicateRecordException with the specified detail message.
	 *
	 * @param msg the detail message
	 */
	public DuplicateRecordException(String msg) {
		super(msg);
	}

}