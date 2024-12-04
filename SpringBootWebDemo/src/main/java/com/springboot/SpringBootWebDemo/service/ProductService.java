package com.springboot.SpringBootWebDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SpringBootWebDemo.Repo.ProductRepo;
import com.springboot.SpringBootWebDemo.model.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
//	List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "Iphone", 50000), 
//			new Product(2, "Samsung", 60000))); // creating new arraylist will make it resizable
//	
//	
	public List<Product> getProducts(){
		return productRepo.findAll();
		
	}


	public Optional<Product> getProductByID(int pid) {
		// TODO Auto-generated method stub
//		return products.stream().filter(p-> p.getProdId()==pid).findFirst().orElse(new Product(0,"No Item",0));
		return productRepo.findById(pid);

	
	}


	public void addProduct(Product prod) {
		// TODO Auto-generated method stub
//		products.add(prod);
		productRepo.save(prod);
		
	}


	public void update(Product product) {
		// TODO Auto-generated method stub
//		int ind=0;
//		for (Product product2 : products) {
//			if (product2.getProdId()== product.getProdId()) {
//				ind = product2.getProdId();
//			}
//		}		
		
//		products.set(ind, product);
		productRepo.save(product);
	}


	public void delete(int prodId) {
		// TODO Auto-generated method stub
		
//		int ind=0;
//		for (Product product2 : products) {
//			if (product2.getProdId()== prodId) {
//				ind = product2.getProdId();
//			}
//		}	
//		
//		products.remove(ind);
		productRepo.deleteById(prodId);
		
	}

}
