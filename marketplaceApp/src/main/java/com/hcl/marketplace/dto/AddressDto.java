package com.hcl.marketplace.dto;

import javax.validation.constraints.NotEmpty;

public class AddressDto {
	@NotEmpty
	private String addressLine1;
	
	private String addressLine2;
	
	@NotEmpty
	private String state;
	@NotEmpty
	private String country;
}
