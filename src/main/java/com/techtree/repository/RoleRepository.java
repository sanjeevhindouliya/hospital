package com.techtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtree.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
