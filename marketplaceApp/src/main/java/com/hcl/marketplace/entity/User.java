package com.hcl.marketplace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
//table: user
@Getter
@Setter
@Entity(name="user")
@Table
public class User {
//	Value: user_id			Type: int
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
//	Value: first_name 		Type: varchar(45)
	@Column(name="first_name", length = 45, nullable = false, unique = false)
	private String first_name;
	
//	Value: last_name		Type: varchar(45)
	@Column(name="last_name", length = 45, nullable = false, unique = false)
	private String last_name;
	
//	Value: email			Type: varchar(45)
	@Getter
	@Column(length = 45, nullable = false, unique = true)
	private String email;

//	Value: username			Type: varchar(45)
	@Column(length = 45, nullable = false, unique = false)
	private String username;
	
//	Value: password			Type: varchar(45)
	@Column(length = 45, nullable = false, unique = false)
	private String password;
	
//	Value: email_verified		Type: tinyint
	@Column(name="email_verified", nullable = false, unique = false)
	private boolean email_verified = false;
	
	public User(){}
	
	//Constructor used for registration
	public User(String email, String userName, String password, String firstName, String lastName) {
		this.setEmail(email);
		this.username = userName;
		this.password = password;
		this.first_name = firstName;
		this.last_name = lastName;
		this.email_verified = false;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	

	
}
