package com.springboot.SpringBootWebDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.SpringBootWebDemo.model.Product;

@Service
public class ProductService {
	
	List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "Iphone", 50000), 
			new Product(2, "Samsung", 60000))); // creating new arraylist will make it resizable
	
	
	public List<Product> getProducts(){
		return products;
		
	}


	public Product getProductByID(int pid) {
		// TODO Auto-generated method stub
		return products.stream().filter(p-> p.getProdId()==pid).findFirst().orElse(new Product(0,"No Item",0));
				}


	public void addProduct(Product prod) {
		// TODO Auto-generated method stub
		products.add(prod);
		
	}


	public void update(Product product) {
		// TODO Auto-generated method stub
		int ind=0;
		for (Product product2 : products) {
			if (product2.getProdId()== product.getProdId()) {
				ind = product2.getProdId();
			}
		}		
		
		products.set(ind, product);
	}


	public void delete(int prodId) {
		// TODO Auto-generated method stub
		
		int ind=0;
		for (Product product2 : products) {
			if (product2.getProdId()== prodId) {
				ind = product2.getProdId();
			}
		}	
		
		products.remove(ind);
		
		
	}

}
