package com.hcl.marketplace.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.marketplace.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("SELECT u FROM user WHERE u.username = ?1")
	public User findByUsername(String username);
	
	@Query("Select u From user where u.email = ?1")
	public User findByEmail(String email);
}
