package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;

/**
 * Form class for Forgot Password.
 * <p>
 * This form is used to validate the login ID submitted by the user
 * for the forgot password functionality.
 * </p>
 *
 * @author Mehreen
 */
public class ForgetPasswordForm extends BaseForm {

	@NotEmpty(message = "Login Id is required")
	private String loginId;

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
}