package com.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dao.UserRepositoryDAO;
import com.spring.model.AdminModel;
import com.spring.model.DoctorModel;
import com.spring.model.User;
import com.spring.service.AdminService;
import com.spring.service.DoctorService;
import com.spring.service.UserDetailsService;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class AdminController {
	

	
	@Autowired
	private UserRepositoryDAO uss;
	private DoctorService dss;
//	@GetMapping("/test")
//	public String Test() {
//		System.out.println("faaaaaaaaaaaaaaaaaakkk");
//		return "Success";
//		
//	}
	
//	@PostMapping
//	public AdminModel create(@RequestBody AdminModel modelobj) {
//	return adms.create(modelobj);
//	}

//	@GetMapping(path= {"/{id}"})
//	public Optional<AdminModel> findById(@PathVariable String id){
//	return adms.findById(id);
//	}
	
	@GetMapping("/all")
	public List<User> getUsers() {
		return (List<User>)uss.findAll();
			
		}
	@GetMapping("/doc/all")
	public List<DoctorModel> getDoctors() {
		return (List<DoctorModel>)dss.findAll();
			
		}
	
//	@PutMapping(path= {"update/{id}"})
//		public AdminModel update( @RequestBody AdminModel modelobj ) {
//		
//		return adms.update(modelobj);
//	}
	@DeleteMapping(path= {"/{id}"})
	public void deleteById(@PathVariable("id") long id){
		uss.deleteById(id);
	}
}
