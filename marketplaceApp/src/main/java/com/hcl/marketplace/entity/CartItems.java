package com.hcl.marketplace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="cart_items")
@Table
@IdClass(CartKey.class)

public class CartItems{	
	@Id
	@Column(name="user_id", nullable = false, unique = false)
	private int userId;
	
	public CartItems() {}
	
	@Id
	@Column(name="product_id", nullable = false, unique = false)
	private int productId;
	
	@Column(name="count", nullable = true, unique = false)
	private int count;

}
