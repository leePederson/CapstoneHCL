package com.hcl.marketplace.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="user_roles")
@IdClass(UserRolesKey.class)
@Table
public class UserRoles {
	
	public UserRoles() {}
	
	
	@Id
	private int roleId;
	
	@Id
	private int userId;

}
