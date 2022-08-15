package com.hcl.marketplace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Entity(name="credit_card")
@Table
@Getter
@Setter
public class CreditCard {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ccId;
	
	public CreditCard() {}
	
	@Column(name="name", length = 45, nullable = false, unique = false)
	private String name;
	
	@Column(name="cc_number", length = 45, nullable = false, unique = false)
	private String ccNumber;
	
	@Column(name="exp_date", length = 45, nullable = false, unique = false)
	private String expDate;
	
	@Column(name="security_code", length = 45, nullable = false, unique = false)
	private String securityCode;
	
	@Column(name="user_id", nullable = false, unique = false)
	private int userId;

}
