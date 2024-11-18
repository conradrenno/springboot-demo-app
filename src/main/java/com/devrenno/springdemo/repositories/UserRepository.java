package com.devrenno.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrenno.springdemo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
