package com.MyProject.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyProject.productservice.entity.Product;
import com.MyProject.productservice.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts() {
	    List<Product> products = productService.getAllProducts();
	    return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id) {
	    Product product = productService.getProductById(id);
	    return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		 Product savedProduct = productService.addProducts(product);
	        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Product> updateproduct(@PathVariable Long id,@RequestBody Product productDetails){
		 Product updatedProduct = productService.updateProduct(id, productDetails);
	        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
	    productService.deleteProducts(id);
	    return ResponseEntity.noContent().build();
	}

}
