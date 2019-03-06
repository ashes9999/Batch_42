package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.spring.model.AppointmentModel;

@Repository
public interface AppointmentService {
	AppointmentModel create(AppointmentModel Appointment);
	void delete(String id);
	List<AppointmentModel> findAll();
	Optional<AppointmentModel> findById(String id);
	List<AppointmentModel> findByDoctor(String id);
}
