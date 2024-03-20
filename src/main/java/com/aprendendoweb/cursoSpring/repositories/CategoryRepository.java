package com.aprendendoweb.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.cursoSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
