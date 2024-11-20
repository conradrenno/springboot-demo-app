package com.devrenno.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrenno.springdemo.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
