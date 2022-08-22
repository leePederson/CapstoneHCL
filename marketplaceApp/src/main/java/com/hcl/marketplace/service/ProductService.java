package com.hcl.marketplace.service;

import java.util.List;

import com.hcl.marketplace.entity.Product;

public interface ProductService {
	public Product saveProduct(Product product);

	public List<Product> getAllUsers();


	public Product updateuser(Integer ProductId, Product product);


}
