package com.techtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtree.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
