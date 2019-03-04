package com.spring.service;

import java.util.List;
import java.util.Optional;

import com.spring.model.AppointmentModel;


public interface AppointmentService {
	AppointmentModel create(AppointmentModel Appointment);
	void delete(Long id);
	List<AppointmentModel> findAll();
	Optional<AppointmentModel> findById(Long id);
}
