package com.MyProject.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MyProject.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
