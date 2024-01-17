package com.example.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.dto.ResponseDto;
import com.example.product.model.Product;
import com.example.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/get")
	public Product getProdById(@RequestParam("id") long id) {
		return productService.getProductById(id);
	}
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseDto deleteProduct(@PathVariable("id") long id) {
		return new ResponseDto(200, "ok", productService.deleteProductById(id));
	}
}
