package com.hcl.marketplace.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserInfo {

	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private boolean emailVerified;

}
