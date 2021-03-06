package com.spring.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.User;



public interface UserRepositoryDAO extends CrudRepository<User, Long> {
	Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
