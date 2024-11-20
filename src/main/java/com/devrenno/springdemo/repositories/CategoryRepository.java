package com.devrenno.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrenno.springdemo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
