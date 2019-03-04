package com.spring.service;
import java.util.List;
import java.util.Optional;

import com.spring.model.AdminModel;

public interface AdminService  {
	AdminModel create(AdminModel admin);
	void delete(String id);
	List<AdminModel> findAll();
	Optional<AdminModel> findById(String id);
	AdminModel update(AdminModel admin);

}
