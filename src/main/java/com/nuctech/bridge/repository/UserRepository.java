package com.nuctech.bridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuctech.bridge.entity.User;




public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
