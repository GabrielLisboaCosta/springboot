package com.aprendendoweb.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.cursoSpring.entities.OrderItem;
import com.aprendendoweb.cursoSpring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
