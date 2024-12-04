package com.springboot.SpringBootWebDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringBootWebDemo.model.Product;
import com.springboot.SpringBootWebDemo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/products")
	public List<Product> getProductService(){
		return service.getProducts();
	}

}
