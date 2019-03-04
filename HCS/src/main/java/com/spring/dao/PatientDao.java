package com.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.PatientModel;

public interface PatientDao extends CrudRepository<PatientModel, String> {

}
