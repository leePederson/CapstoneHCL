package com.hcl.marketplace.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CartKey implements Serializable {
		private int userId;
		private int productId;
		
		public CartKey(int userId, int productId) {
			this.userId = userId;
			this.productId = productId;
		}
	}
