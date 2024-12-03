package com.devrenno.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrenno.springdemo.entities.OrderItem;
import com.devrenno.springdemo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
