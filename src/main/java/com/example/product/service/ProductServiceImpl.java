package com.example.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.product.exception.ProductNotFoundException;
import com.example.product.exception.WrongInputException;
import com.example.product.model.Product;
import com.example.product.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public Product getProductById(long id){
		Product byId = productRepo.findById(id).orElseThrow( () -> new ProductNotFoundException("Product not found!"));
		return byId;
	}

	@Override
	public Product saveProduct(Product product) {
		if(ObjectUtils.isEmpty(product)) {
			return productRepo.save(product);
		}else{
			throw new WrongInputException("Product not found!");
		}
	}

	@Override
	public Product deleteProductById(long id) {
		Product productById = getProductById(id);
		if(productById != null) {
			productRepo.deleteById(id);
		}
		return productById;
	}

}
