package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.DoctorDao;
import com.spring.model.DoctorModel;
@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	private DoctorDao DDao;
	@Override
	public DoctorModel create(DoctorModel doctor) {
		// TODO Auto-generated method stub
		return DDao.save(doctor);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
		DDao.deleteById(id);
	}

	@Override
	public List<DoctorModel> findAll() {
		// TODO Auto-generated method stub
		return (List<DoctorModel>) DDao.findAll();
	}

	@Override
	public Optional<DoctorModel> findById(String id) {
		// TODO Auto-generated method stub
		return DDao.findById(id);
	}

	@Override
	public DoctorModel update(DoctorModel doctor) {
		// TODO Auto-generated method stub
		return DDao.save(doctor);
	}

}
