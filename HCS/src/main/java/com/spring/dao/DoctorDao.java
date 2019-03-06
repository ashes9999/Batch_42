package com.spring.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.DoctorModel;
public interface DoctorDao extends CrudRepository<DoctorModel, String> {
	List<DoctorModel> findByDoctorspecialization(String id);
}
