package com.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.AppointmentModel;
@Repository
public interface AppointmentDao extends CrudRepository<AppointmentModel, Long> {

}
