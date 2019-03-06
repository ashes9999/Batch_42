package com.spring.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.spring.model.User;
@Repository
public interface UserDetailsService {
	UserDetails loadUserByUsername(String username) ;
	List<User> getUsers();
}
