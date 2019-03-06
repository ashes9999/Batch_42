package com.spring.controller;

import java.util.List;

import java.util.Optional;
import java.util.function.IntPredicate;

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

import com.spring.model.DoctorModel;
import com.spring.service.DoctorService;
@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping(path="/pm/doctor")
public class DoctorController {
	@Autowired
	private DoctorService adms;
	
	
	@PostMapping
	public DoctorModel create(@RequestBody DoctorModel modelobj) {
	if (modelobj!=null) {
		System.out.println(modelobj);
		return adms.create(modelobj);
		
	}
	return null;
	}
	@GetMapping("/{id}")
	public Optional<DoctorModel> findById(@PathVariable("id") String id){
	return adms.findById(id);
	}

	@GetMapping("spec/{special}")
	public List<DoctorModel> findBySpecial(@PathVariable("special") String id){
	return adms.findByDoctorspecialization(id);
	}

	@GetMapping("/all")
	public List<DoctorModel> getDoctorModels() {
		return (List<DoctorModel>)adms.findAll();
			
		}
	@PutMapping(path= {"update/{id}"})
		public DoctorModel update( @PathVariable("id") String id,@RequestBody DoctorModel modelobj ) {
		
		return adms.update(modelobj);
	}
	@DeleteMapping(path= {"/{id}"})
	public void deleteById(@PathVariable ("id") String id){
		adms.delete(id);
	}
}
