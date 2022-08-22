package com.hcl.marketplace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="roles")

@Table
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	public Roles() {}
	
	@Column(name="role_name", length = 45, nullable = false, unique = false)
	private String roleName;

	
	@Override
	public String toString() {
		return this.roleName;
	}
}
