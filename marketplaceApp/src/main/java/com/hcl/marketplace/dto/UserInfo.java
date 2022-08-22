package com.hcl.marketplace.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserInfo {
	@Getter
	@Setter
	private String first_name;
	@Getter
	@Setter
	private String lastName;
	@Getter
	@Setter
	private String email;
	@Getter
	@Setter
	private String username;
	@Getter
	@Setter
	private String password;
	@Getter
	@Setter
	private boolean emailVerified = false;

}
