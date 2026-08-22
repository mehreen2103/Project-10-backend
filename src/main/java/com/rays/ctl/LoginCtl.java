package com.rays.ctl;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.common.UserContext;
import com.rays.config.JWTUtil;
import com.rays.dto.UserDTO;
import com.rays.form.ForgetPasswordForm;
import com.rays.form.LoginForm;
import com.rays.form.UserForm;
import com.rays.form.UserRegistrationForm;
import com.rays.service.UserServiceInt;

/**
 * REST controller for handling authentication-related operations.
 * <p>
 * This controller provides APIs for user login, registration,
 * logout, and password recovery.
 * </p>
 *
 * @author Mehreen
 */
@RestController
@RequestMapping(value = "Auth")
public class LoginCtl extends BaseCtl<UserForm, UserDTO, UserServiceInt> {

	@Autowired
	private JWTUtil jwtUtil;

	/**
	 * Authenticates the user and generates a JWT token.
	 *
	 * @param form the login request containing login ID and password
	 * @param bindingResult contains validation results
	 * @return an {@link ORSResponse} containing authentication details
	 * @throws Exception if an authentication error occurs
	 */
	@PostMapping("login")
	public ORSResponse login(@RequestBody @Valid LoginForm form, BindingResult bindingResult) throws Exception {

		ORSResponse res = validate(bindingResult);

		if (!res.isSuccess()) {
			return res;
		}

		UserDTO dto = baseService.authenticate(form.getLoginId(), form.getPassword());

		if (dto == null) {
			res.setSuccess(false);
			res.addMessage("Invalid Login ID & Password");
		} else {

			UserContext context = new UserContext(dto);

			String token = jwtUtil.generateToken(dto.getId(), dto.getLoginId(), dto.getRoleName());

			res.setSuccess(true);
			res.addData(dto);
			res.addResult("loginId", dto.getLoginId());
			res.addResult("role", dto.getRoleName());
			res.addResult("fname", dto.getFirstName());
			res.addResult("lname", dto.getLastName());
			res.addResult("token", token);
			return res;
		}
		return res;
	}

	/**
	 * Registers a new user in the system.
	 *
	 * @param form the registration form containing user details
	 * @param bindingResult contains validation results
	 * @return an {@link ORSResponse} indicating the registration status
	 */
	@PostMapping("signUp")
	public ORSResponse signUp(@RequestBody @Valid UserRegistrationForm form, BindingResult bindingResult) {

		ORSResponse res = validate(bindingResult);

		if (!res.isSuccess()) {
			return res;
		}

		UserDTO dto = baseService.findByLoginId(form.getLoginId(), userContext);

		if (dto != null) {
			res.setSuccess(false);
			res.addMessage("Login Id already exists");
			return res;
		}

		dto = new UserDTO();
		dto.setFirstName(form.getFirstName());
		dto.setLastName(form.getLastName());
		dto.setLoginId(form.getLoginId());
		dto.setPassword(form.getPassword());
		dto.setDob(form.getDob());
		dto.setGender(form.getGender());
		dto.setPhone(form.getPhone());
		dto.setStatus("Inactive");
		dto.setRoleId(2L);

		baseService.register(dto, userContext);

		res.setSuccess(true);
		res.addMessage("User has been registered successfully..!!");
		return res;
	}

	/**
	 * Logs out the currently logged-in user by invalidating the session.
	 *
	 * @param session the current HTTP session
	 * @return an {@link ORSResponse} indicating logout status
	 * @throws Exception if an error occurs during logout
	 */
	@GetMapping("logout")
	public ORSResponse logout(HttpSession session) throws Exception {

		ORSResponse res = new ORSResponse();

		session.invalidate();

		res.addMessage("Logout successfully..!!");

		return res;
	}

	/**
	 * Processes a forgot password request.
	 * <p>
	 * If the login ID exists, the user's password is sent to the
	 * registered email address.
	 * </p>
	 *
	 * @param form the forgot password request
	 * @param bindingResult contains validation results
	 * @return an {@link ORSResponse} indicating the request status
	 */
	@PostMapping("forgetPassword")
	public ORSResponse forgetPassword(@RequestBody @Valid ForgetPasswordForm form, BindingResult bindingResult) {

		ORSResponse res = validate(bindingResult);

		if (!res.isSuccess()) {
			return res;
		}

		UserDTO fDto = baseService.forgotPassword(form.getLoginId());

		if (fDto == null) {
			res.setSuccess(false);
			res.addMessage("LoginId / Email not found.");
			return res;
		} else {
			res.setSuccess(true);
			res.addMessage("Hello " + fDto.getFirstName() + " " + fDto.getLastName()
					+ "..! Your password has been sent on your email.");
		}
		return res;
	}
}