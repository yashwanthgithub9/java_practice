package com.springboot.SpringBootWebDemo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.SpringBootWebDemo.model.Product;

@Service
public class ProductService {
	
	List<Product> products = Arrays.asList(new Product(1, "Iphone", 50000), 
			new Product(2, "Samsung", 60000));
	
	
	public List<Product> getProducts(){
		return products;
		
	}

}
