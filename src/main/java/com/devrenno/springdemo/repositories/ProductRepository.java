package com.devrenno.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrenno.springdemo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
