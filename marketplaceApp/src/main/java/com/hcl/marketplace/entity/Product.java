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
@Entity(name="product")
@Table
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	public Product() {}
	
	@Column(name="prod_category", nullable = false, unique = false)
	private int prodCategory;
	
	@Column(name="prod_count", nullable = false, unique = false)
	private int prodCount;
	
	@Column(name="prod_desc", nullable = false, unique = false)
	private String prodDesc;

	@Column(name="prod_upc", nullable = false, unique = false)
	private String prodUpc;
	
	@Column(name="prod_image", nullable = false, unique = false)
	private String prodImage;
	
	@Column(name="prod_name",length = 45, nullable = false, unique = false)
	private String prodName;
	
	@Column(name="prod_price", nullable = false, unique = false)
	private BigDecimal prodPrice; 
	
	@Column(name="production_status", nullable = false, unique = false)
	private boolean productionStatus;
	

}
