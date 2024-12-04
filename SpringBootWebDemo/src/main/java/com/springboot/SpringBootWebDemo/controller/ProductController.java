package com.springboot.SpringBootWebDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringBootWebDemo.model.Product;
import com.springboot.SpringBootWebDemo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products") // default mapping is GET for @RequestMapping
	public List<Product> getProductService(){
		return service.getProducts();
	}
	
	@GetMapping("/products/{prodId}")
	public Product getProduct(@PathVariable int  prodId) { //@PathVariabe matches prodId in URL with this method args
		return service.getProductByID(prodId);
		
	}
	@PostMapping("/products") // Explicitly mapping POST
	public void setproduct( @RequestBody Product prod) { //generaly we have to create a form and accept data from fields but for now we are using postman
		// postman can be used to send JSON data from client to service.
		System.out.println(prod);
		service.addProduct(prod);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product product) {
		
		service.update(product);
	}
	
	@DeleteMapping("/products/{prodId}")
	public void deleteProduct(@PathVariable int prodId) {
		service.delete(prodId);
	}

}
