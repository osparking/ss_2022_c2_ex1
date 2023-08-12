package space.bum.security;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import space.bum.entities.Authority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {

	private static final long serialVersionUID = 1L;

	private final Authority authority;

	@Override
	public String getAuthority() {
		return authority.getName();
	}
}
