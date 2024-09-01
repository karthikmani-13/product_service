package com.MyProject.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyProject.productservice.entity.Product;
import com.MyProject.productservice.exception.ResourceNotFoundException;
import com.MyProject.productservice.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productrepo;
	
	public List<Product> getAllProducts(){
		return productrepo.findAll();
	}
	
	public Product getProductById(Long id) {
		return productrepo.findById(id).orElseThrow(()->new ResourceNotFoundException("product not found exception"));
	}
	
	public Product updateProduct(Long id,Product productDetails) {
		Product product=productrepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Not Found"));
		product.setId(productDetails.getId());
		product.setName(productDetails.getName());
		product.setDescription(productDetails.getDescription());
		product.setPrice(productDetails.getPrice());
		product.setQuantity(productDetails.getQuantity());
		return productrepo.save(product);
	}
	
	public Product addProducts(Product product) {
		return productrepo.save(product);
	}
	
	public void deleteProducts(Long id) {
		Product product = productrepo.findById(id)
		        .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
		    productrepo.delete(product);
	}
	
	

}
