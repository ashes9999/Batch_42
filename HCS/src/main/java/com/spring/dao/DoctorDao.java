package com.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.DoctorModel;
@Repository
public interface DoctorDao extends CrudRepository<DoctorModel, String> {

}
