//package com.spring.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.spring.User;
//import com.spring.service.UserService;
//import com.spring.service.UserServiceImpl;
//
//@CrossOrigin(origins="*",maxAge=3600)
//@RestController
//@RequestMapping("/users")
//public class UserController {
//@Autowired
//private UserService usrIm;
//@GetMapping("/test")
//public String Test() {
//	System.out.println("faaaaaaaaaaaaaaaaaakkk");
//	return "Success";
//	
//}
//
//@PostMapping
//public User create(@RequestBody User user) {
//return usrIm.create(user);
//}
//
//@GetMapping(path= {"/{id}"})
//public Optional<User> findById(int id){
//return usrIm.findById(id);
//}
//
//@GetMapping("/all")
//public List getUsers() {
//	return usrIm.findAll();
//		
//	}
//@PutMapping(path= {"/{id}"})
//	public User update(@PathVariable("id") int id, @RequestBody User user ) {
//	user.setId(id);
//	return usrIm.update(user);
//}
//@DeleteMapping(path= {"/{id}"})
//public Optional<User> deleteById(@PathVariable("id") int id){
//	return usrIm.delete(id);
//}
//	
//}
//
