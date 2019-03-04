package com.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.AdminModel;
@Repository
public interface AdminDao extends CrudRepository<AdminModel, String> {

}
