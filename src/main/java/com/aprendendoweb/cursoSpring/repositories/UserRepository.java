package com.aprendendoweb.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.cursoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
