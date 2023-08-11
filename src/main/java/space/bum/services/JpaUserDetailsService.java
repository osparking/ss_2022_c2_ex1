package space.bum.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lombok.AllArgsConstructor;
import space.bum.repositories.UserRepository;
import space.bum.security.SecurityUser;

@AllArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

	private final UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {
		var user = userRepository.findUserByUsername(username);
		return user.map(SecurityUser::new).orElseThrow(
				() -> new UsernameNotFoundException("존재하지않는사용자:" + username));
	}

}
