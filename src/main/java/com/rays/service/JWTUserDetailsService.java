package com.rays.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.rays.dto.UserDTO;

/**
 * JWTUserDetailsService is used by Spring Security to load user details
 * during authentication using username (loginId).
 *
 * It fetches user data from database and converts it into
 * Spring Security UserDetails object.
 *
 * @author Mehreen
 * 
 */
@Service
public class JWTUserDetailsService implements UserDetailsService {

	/**
	 * Password encoder bean used for encoding passwords.
	 *
	 * @return BCryptPasswordEncoder instance
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/**
	 * User service used to fetch user data from database.
	 */
	@Autowired
	UserServiceInt userService;

	/**
	 * Loads user details by username (loginId).
	 *
	 * @param username login ID of the user
	 * @return UserDetails object for Spring Security
	 * @throws UsernameNotFoundException if user is not found
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserDTO user = userService.findByLoginId(username, null);

		if (user == null) {
			System.out.println("user found nuulllll");
			throw new UsernameNotFoundException("User not found with username : " + username);
		}

		return User.builder()
				.username(user.getLoginId())
				.password(passwordEncoder().encode(user.getPassword()))
				.roles("USER")
				.build();
	}
}