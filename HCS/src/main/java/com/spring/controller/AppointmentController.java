package com.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.AppointmentModel;
import com.spring.service.AppointmentService;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping(path="/Appointment")
public class AppointmentController {
	
	@Autowired
	private AppointmentService apts;

	@PostMapping
	public AppointmentModel create(@RequestBody AppointmentModel modelobj) {
	if (modelobj!=null) {
		System.out.println(modelobj.toString());
		return apts.create(modelobj);
		
	}
	return null;
	}

	@GetMapping(path= {"/{id}"})
	public Optional<AppointmentModel> findById(@PathVariable Long id){
	return apts.findById(id);
	}

	@GetMapping("/all")
	public List<AppointmentModel> getAppointmentModels() {
		return apts.findAll();
			
		}

	@DeleteMapping(path= {"/{id}"})
	public void deleteById(@PathVariable("id") Long id){
		apts.delete(id);
	}
}
