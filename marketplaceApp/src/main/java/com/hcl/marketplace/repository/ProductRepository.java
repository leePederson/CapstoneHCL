package com.hcl.marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.hcl.marketplace.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
