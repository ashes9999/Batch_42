package com.spring.service;

import java.util.List;
import java.util.Optional;


import com.spring.model.PatientModel;

public interface PatientService{
	PatientModel create(PatientModel patient);
	
	List<PatientModel> findAll();
	Optional<PatientModel> findById(String id);
	PatientModel update(PatientModel patient);
	void delete(String id);

}
