package com.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
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
import com.spring.model.LoginForm;
import com.spring.model.PatientModel;
import com.spring.response.JwtResponse;
import com.spring.service.PatientService;
import com.spring.service.UserDetailsService;
import com.spring.service.UserPrinciple;
import com.spring.service.UserService;

@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping(path="user/patient")
public class PatientController {
@Autowired 
private PatientService pser;


JwtResponse jwtr;


@PostMapping
public PatientModel create(@RequestBody PatientModel modelobj) {
	
	return pser.create(modelobj);
	

}

@GetMapping(path= {"/{id}"})
public Optional<PatientModel> findById(@PathVariable("id") String id){
	System.out.println("is calling");
return pser.findById(id);
}

@GetMapping("/all")
public List<PatientModel> getPatientModels() {
	return pser.findAll();
		
	}
@PutMapping(path= {"update/{id}"})
	public PatientModel update( @PathVariable("id") int id,@RequestBody PatientModel modelobj ) {
	modelobj.setPatientId(id);
	return pser.update(modelobj);
}
@DeleteMapping(path= {"/{id}"})
public void deleteById(@PathVariable("id") String id){
	pser.delete(id);
}

}
