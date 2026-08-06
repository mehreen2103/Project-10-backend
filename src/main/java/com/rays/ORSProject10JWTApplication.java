package com.rays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Main class for the ORS Project 10 JWT Spring Boot application.
 * <p>
 * This class is responsible for bootstrapping the Spring Boot application
 * and configuring Cross-Origin Resource Sharing (CORS) settings.
 * </p>
 *
 * @author Mehreen
 */
@SpringBootApplication
public class ORSProject10JWTApplication {

	/**
	 * Starts the Spring Boot application.
	 *
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {

		SpringApplication.run(ORSProject10JWTApplication.class, args);
	}

	/**
	 * Configures Cross-Origin Resource Sharing (CORS) for the application.
	 * <p>
	 * Allows requests from the Angular application running on
	 * {@code http://localhost:4200}.
	 * </p>
	 *
	 * @return the configured {@link WebMvcConfigurer} instance
	 */
	@Bean
	public WebMvcConfigurer corsConfig() {
		WebMvcConfigurer w = new WebMvcConfigurer() {

			/**
			 * Adds CORS mappings to the application.
			 *
			 * @param registry the CORS registry used to configure mappings
			 */
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				CorsRegistration cors = registry.addMapping("/**")
						.allowedOrigins("http://localhost:4200")
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
						.allowedHeaders("*")
						.allowCredentials(true);
			}
		};
		return w;
	}

}