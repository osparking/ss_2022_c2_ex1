package space.bum.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import space.bum.services.JpaUserDetailsService;

@Configuration
public class SecurityConfig {
	
	@Bean
	UserDetailsService userDetailsService() {
		return new JpaUserDetailsService();
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
