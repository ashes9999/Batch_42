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

import com.spring.model.AdminModel;
import com.spring.service.AdminServiceImpl;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping(path="/admin")
public class AdminController {
	
	@Autowired
	private AdminServiceImpl adms;
	
	@GetMapping("/test")
	public String Test() {
		System.out.println("faaaaaaaaaaaaaaaaaakkk");
		return "Success";
		
	}
	
	@PostMapping
	public AdminModel create(@RequestBody AdminModel modelobj) {
	return adms.create(modelobj);
	}

	@GetMapping(path= {"/{id}"})
	public Optional<AdminModel> findById(String id){
	return adms.findById(id);
	}

	@GetMapping("/all")
	public List<AdminModel> getAdminModels() {
		return adms.findAll();
			
		}
	@PutMapping(path= {"update/{id}"})
		public AdminModel update( @RequestBody AdminModel modelobj ) {
		
		return adms.update(modelobj);
	}
	@DeleteMapping(path= {"/{id}"})
	public void deleteById(@PathVariable("id") String id){
		adms.delete(id);
	}
}
