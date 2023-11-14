package com.techtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtree.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
