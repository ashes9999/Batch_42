package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.AdminDao;
import com.spring.model.AdminModel;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao ADaobj;

	@Override
	public AdminModel create(AdminModel admin) {
		// TODO Auto-generated method stub
		return ADaobj.save(admin);
	}

	@Override
	public void delete(String id) {
		Optional<AdminModel> admin = ADaobj.findById(id);
		if (admin !=null)
		ADaobj.deleteById(id);
	}

	@Override
	public List<AdminModel> findAll() {
		// TODO Auto-generated method stub
		return (List<AdminModel>) ADaobj.findAll();
	}

	@Override
	public Optional<AdminModel> findById(String id) {
		
		return ADaobj.findById(id);
	}

	@Override
	public AdminModel update(AdminModel admin) {
		// TODO Auto-generated method stub
		return ADaobj.save(admin);
	}




	
	
	
	
}
