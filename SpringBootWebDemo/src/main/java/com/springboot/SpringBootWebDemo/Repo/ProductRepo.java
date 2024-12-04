package com.springboot.SpringBootWebDemo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.SpringBootWebDemo.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
