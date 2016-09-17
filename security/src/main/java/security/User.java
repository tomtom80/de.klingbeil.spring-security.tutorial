package security;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String passwd;
	private List<GrantedAuthority> createAuthorityList;

public User(String username, String passwd, List<GrantedAuthority> createAuthorityList) {
	this.name = username;
	this.passwd = passwd;
	this.createAuthorityList = createAuthorityList;
}

	public String getName() {
		return name;
	}

	public String getPasswd() {
		return passwd;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return createAuthorityList;
	}

	@Override
	public String getPassword() {
		return passwd;
	}

	@Override
	public String getUsername() {
		return name;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
