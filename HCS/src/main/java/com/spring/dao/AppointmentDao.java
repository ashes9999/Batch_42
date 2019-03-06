package com.spring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.AppointmentModel;
public interface AppointmentDao extends CrudRepository<AppointmentModel, String> {

	List<AppointmentModel> findByDoctorname(String id);

}
