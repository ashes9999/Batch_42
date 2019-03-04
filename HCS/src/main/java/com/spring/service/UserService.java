package com.spring.service;

import java.util.List;
import java.util.Optional;

import com.spring.User;

public interface UserService {
	User create(User user);
	Optional<User> delete(int id);
	List<User> findAll();
	Optional<User> findById(int id);
	User update(User user);
}
