package com.hcl.marketplace.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
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
	@Getter
	@Setter
	@Column(name="first_name", length = 45, nullable = false, unique = false)
	private String firstName;
	
//	Value: last_name		Type: varchar(45)
	@Column(name="last_name", length = 45, nullable = false, unique = false)
	private String lastName;
	
//	Value: email			Type: varchar(45)
	@Getter
	@Column(length = 45, nullable = false, unique = true)
	private String email;

//	Value: username			Type: varchar(45)
	@Column(length = 45, nullable = false, unique = false)
	private String username;
	
//	Value: password			Type: varchar(64)
	@Column(length = 64, nullable = false, unique = false)
	private String password;
	
//	Value: email_verified		Type: tinyint
	@Column(name="email_verified", nullable = false, unique = false)
	private boolean email_verified = false;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "user_roles",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name="role_id")
		)
	private Set<Roles> roles = new HashSet<>();
	
	public void addRole(Roles role) {
		this.roles.add(role);
	}
	
	public User(){
		this.email_verified=false;
	}
	
	//Constructor used for registration
	public User(String email, String userName, String password, String firstName, String lastName) {
		this.email = email;
		this.username = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email_verified = false;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public int getUserId() {
		return this.userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	
	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}
	
	public void setLastName(String last_name) {
		this.lastName = last_name;
	}
	
	public String getLastName() {
		return this.lastName;
	}

	public void setPassword(String encodedPassword) {
		this.password=encodedPassword;
		
	}
	
	public boolean getEmailVerified() {
		return this.email_verified;
	}


	

	
}
