package com.rays.exception;

/**
 * Exception thrown when a database-related error occurs.
 * <p>
 * This exception extends {@link RuntimeException} and is used to
 * represent errors that occur during database operations.
 * </p>
 *
 * @author Mehreen
 */
public class DatabaseException extends RuntimeException {

	/**
	 * Constructs a new DatabaseException with the specified detail message.
	 *
	 * @param msg the detail message
	 */
	public DatabaseException(String msg) {
		super(msg);
	}
}