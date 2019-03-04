package com.spring.service;

import java.util.List;
import java.util.Optional;

import com.spring.model.DoctorModel;


public interface DoctorService {
	DoctorModel create(DoctorModel doctor);
	void delete(String id);
	List<DoctorModel> findAll();
	Optional<DoctorModel> findById(String id);
	DoctorModel update(DoctorModel doctor);
}
