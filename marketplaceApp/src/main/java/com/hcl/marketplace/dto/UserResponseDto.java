package com.hcl.marketplace.dto;

import lombok.Getter;
import lombok.Setter;

public class UserResponseDto {
	public UserResponseDto(String firstName, long count) {
		this.firstName = firstName;
		this.count = count;
	}
	@Getter
	@Setter
	private String firstName;
	
	@Getter
	@Setter
	private String lastName;
	
	@Getter
	@Setter
	private long count;
	

}
