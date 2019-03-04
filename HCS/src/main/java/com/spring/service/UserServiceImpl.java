//package com.spring.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.spring.User;
//import com.spring.dao.UserRepositoryDAO;
//@Service
//public class UserServiceImpl implements UserService {
//	@Autowired
//	private UserRepositoryDAO repo;
//	@Override
//	public User create(User user) {
//		// TODO Auto-generated method stub
//		return repo.save(user);
//	}
//
//	@Override
//	public Optional<User> delete(int id) {
//		Optional<User> user = findById(id);
//		if (user!=null) {
//			repo.deleteById(id);
//		}
//		return user;
//	}
//
//	@Override
//	public List<User> findAll() {
//		// TODO Auto-generated method stub
//		return (List<User>) repo.findAll();
//	}
//
//	@Override
//	public Optional<User> findById(int id) {
//		// TODO Auto-generated method stub
//		return repo.findById(id);
//	}
//
//	@Override
//	public User update(User user) {
//		// TODO Auto-generated method stub
//		return repo.save(user);
//	}
//
//}
