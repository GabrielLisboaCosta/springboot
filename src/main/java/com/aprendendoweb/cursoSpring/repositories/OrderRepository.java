package com.aprendendoweb.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.cursoSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
