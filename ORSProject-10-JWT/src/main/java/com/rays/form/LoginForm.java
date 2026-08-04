package com.rays.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * Form class for User Login.
 * <p>
 * This form is used to capture and validate the user's login
 * credentials before authentication.
 * </p>
 *
 * @author Mehreen
 */
public class LoginForm {

	@NotEmpty(message = "Login Id is required")
	@Email
	private String loginId;

	@NotEmpty(message = "Password is required")
	private String password;

	/**
	 * Returns the login ID.
	 *
	 * @return the login ID
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * Sets the login ID.
	 *
	 * @param loginId the login ID
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * Returns the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}