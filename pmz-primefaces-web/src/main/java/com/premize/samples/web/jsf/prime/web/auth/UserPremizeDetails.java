/**
 * 
 */
package com.premize.samples.web.jsf.prime.web.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.premize.samples.web.jsf.prime.web.dto.RolDTO;
import com.premize.samples.web.jsf.prime.web.dto.UsuarioDTO;


/**
 * Premize User Profile
 * @author <a href="mailto:ricardoa.chiriboga@premize.com">Ricardo Alberto Chiriboga</a>
 * @project afe-web
 * @class UserPremizeDetails
 * @date 6/05/2013
 *
 */
public class UserPremizeDetails implements UserDetails {
	
	private static final long serialVersionUID = -7842697462411604864L;
	private UsuarioDTO usuarioDTO;
	private String userName;
	private String password;
	private boolean enabled;

	public UserPremizeDetails(String username, String password, boolean enabled, UsuarioDTO usuarioDTO) {
		super();
		this.usuarioDTO = usuarioDTO;
		this.userName =  username;
		this.password = password;
		this.enabled = enabled;
	}

	/** 
	 * @see org.springframework.security.core.userdetails.UserDetails#getAuthorities()
	 */
	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		
		List<GrantedAuthority> authorities =  new ArrayList<GrantedAuthority>();
		
		for (RolDTO rol : usuarioDTO.getRoles()) {
			GrantedAuthority authority =  new SimpleGrantedAuthority(rol.getNombreRol());
			authorities.add(authority);
		}
		return authorities;
	}

	/** 
	 * @see org.springframework.security.core.userdetails.UserDetails#getPassword()
	 */
	@Override
	public String getPassword() {
		return this.password;
	}

	/** 
	 * @see org.springframework.security.core.userdetails.UserDetails#getUsername()
	 */
	@Override
	public String getUsername() {
		return this.userName;
	}

	/** 
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/** 
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
	 */
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	/** 
	 * @see org.springframework.security.core.userdetails.UserDetails#isCredentialsNonExpired()
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/** 
	 * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		return this.enabled;
	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

}
