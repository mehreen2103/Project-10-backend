package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.rays.common.BaseForm;

/**
 * Form class used for changing the user's password.
 * <p>
 * This form contains the old password, new password,
 * and login ID required for password change.
 * </p>
 *
 * @author Mehreen
 */
public class ChangePasswordForm extends BaseForm {

	@NotEmpty(message = "Old Password is required")
	@Size(min = 2, max = 10)
	private String oldPassword;

	@NotEmpty(message = "New Password is required")
	@Size(min = 2, max = 10)
	private String newPassword;

	private String loginId;

	/**
	 * Returns the old password.
	 *
	 * @return the old password
	 */
	public String getOldPassword() {
		return oldPassword;
	}

	/**
	 * Sets the old password.
	 *
	 * @param oldPassword the old password
	 */
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	/**
	 * Returns the new password.
	 *
	 * @return the new password
	 */
	public String getNewPassword() {
		return newPassword;
	}

	/**
	 * Sets the new password.
	 *
	 * @param newPassword the new password
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

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