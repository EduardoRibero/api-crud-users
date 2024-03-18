package com.example.demo.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Users;

public interface  UsersRepository extends JpaRepository<Users, Long>{

}
