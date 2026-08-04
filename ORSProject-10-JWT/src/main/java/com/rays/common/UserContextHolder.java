package com.rays.common;

/**
 * UserContextHolder is a utility class that stores and manages
 * the UserContext for the current thread using ThreadLocal.
 * It allows access to the logged-in user's information
 * throughout the request lifecycle.
 *
 * @author Mehreen
 */
public class UserContextHolder {

	/**
	 * ThreadLocal object used to store UserContext for each thread.
	 */
	private static final ThreadLocal<UserContext> threadLocal = new ThreadLocal<>();

	/**
	 * Stores the UserContext for the current thread.
	 *
	 * @param context the UserContext to be stored
	 */
	public static void setContext(UserContext context) {
		threadLocal.set(context);
	}

	/**
	 * Returns the UserContext associated with the current thread.
	 *
	 * @return current UserContext
	 */
	public static UserContext getContext() {
		return threadLocal.get();
	}

	/**
	 * Removes the UserContext from the current thread.
	 */
	public static void clear() {
		threadLocal.remove();
	}
}