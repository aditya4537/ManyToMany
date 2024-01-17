package com.example.product.service;

import com.example.product.model.Product;

public interface ProductService {
	
	public Product getProductById(long id);
	
	public Product saveProduct(Product product);
	
	public Product deleteProductById(long id);
}
