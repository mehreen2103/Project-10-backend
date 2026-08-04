package com.rays.common;

import java.util.HashMap;
import java.util.Map;

/**
 * ORSResponse is a common response class used to send
 * success status, messages, data and validation errors
 * from the server to the client.
 *
 * @author Mehreen
 */
public class ORSResponse {

	/**
	 * Key used for input validation errors.
	 */
	public static final String INPUT_ERROR = "inputerror";

	/**
	 * Key used for response messages.
	 */
	public static final String MESSAGE = "message";

	/**
	 * Key used for response data.
	 */
	public static final String DATA = "data";

	/**
	 * Stores response data in key-value format.
	 */
	private Map<String, Object> result = new HashMap<String, Object>();

	/**
	 * Indicates whether the operation was successful.
	 */
	public boolean success = false;

	/**
	 * Default constructor.
	 */
	public ORSResponse() {
	}

	/**
	 * Creates a response with success status.
	 *
	 * @param success operation status
	 */
	public ORSResponse(boolean success) {
		this.success = success;
	}

	/**
	 * Creates a response with success status and message.
	 *
	 * @param success operation status
	 * @param message response message
	 */
	public ORSResponse(boolean success, String message) {
		this.success = success;
		addMessage(message);
	}

	/**
	 * Creates a response with success status, message and data.
	 *
	 * @param success operation status
	 * @param message response message
	 * @param value response data
	 */
	public ORSResponse(boolean success, String message, Object value) {
		this.success = success;
		addMessage(message);
		addData(value);
	}

	/**
	 * Returns the success status.
	 *
	 * @return true if operation is successful, otherwise false
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Sets the success status.
	 *
	 * @param success operation status
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * Returns the response result map.
	 *
	 * @return response result
	 */
	public Map<String, Object> getResult() {
		return result;
	}

	/**
	 * Sets the response result map.
	 *
	 * @param result response result map
	 */
	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	/**
	 * Adds input validation errors to the response.
	 *
	 * @param value validation error object
	 */
	public void addInputError(Object value) {
		result.put(INPUT_ERROR, value);
	}

	/**
	 * Adds a message to the response.
	 *
	 * @param value response message
	 */
	public void addMessage(Object value) {
		result.put(MESSAGE, value);
	}

	/**
	 * Adds data to the response.
	 *
	 * @param value response data
	 */
	public void addData(Object value) {
		result.put(DATA, value);
	}

	/**
	 * Adds a custom key-value pair to the response.
	 *
	 * @param key response key
	 * @param value response value
	 */
	public void addResult(String key, Object value) {
		result.put(key, value);
	}
}