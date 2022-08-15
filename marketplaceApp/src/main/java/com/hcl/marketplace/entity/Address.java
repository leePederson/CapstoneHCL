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
@Entity(name="address")
@Table
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public Address() {}
	
	@Column(name="address1", length = 45, nullable = false, unique = false)
	private String address1;
	
	@Column(name="address2", length = 45, nullable = true, unique = false)
	private String address2;
	
	@Column(name="city", length = 45, nullable = false, unique = false)
	private String city;
	
	@Column(name="state", length = 45, nullable = false, unique = false)
	private String state;
	
	@Column(name="zipcode", length = 45, nullable = false, unique = false)
	private String zipcode;
	
	@Column(name="user_id", nullable = false, unique = false)
	private int userId;
	
}
