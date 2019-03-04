package com.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.DoctorModel;

public interface DoctorDao extends CrudRepository<DoctorModel, Long>{

}
