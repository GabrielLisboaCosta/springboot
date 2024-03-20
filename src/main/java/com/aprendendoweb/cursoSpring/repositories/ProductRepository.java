package com.aprendendoweb.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.cursoSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
