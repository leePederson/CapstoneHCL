package com.hcl.marketplace.entity;

import java.math.BigDecimal;
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
@Entity(name="order")
@Table
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	public Order() {}
	
	@Column(name="product_id", nullable = false, unique = false)
	private int  productId;
	
	@Column(name="user_id", nullable = false, unique = false)
	private int  userId;
	
	@Column(name="cc_id", nullable = false, unique = false)
	private int  ccId;
	
	@Column(name="order_date")
	private java.sql.Timestamp orderDate;
	
	@Column(name="order_amt", nullable = false, unique = false)
	private BigDecimal orderAmt;
	
	@Column(name="order_status",length = 45, nullable = false, unique = false)
	private String orderStatus;
	
	

}
