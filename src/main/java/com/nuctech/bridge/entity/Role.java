package com.nuctech.bridge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "role")
public class Role implements GrantedAuthority{

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	@Column(name = "role_name")
	private String rolename;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	@Override
	public String getAuthority() {
		
		return rolename;
	}
	
	
}
