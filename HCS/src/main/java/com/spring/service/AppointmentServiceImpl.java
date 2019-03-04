package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.AppointmentDao;
import com.spring.model.AdminModel;
import com.spring.model.AppointmentModel;

@Service
public class AppointmentServiceImpl implements AppointmentService{
@Autowired
private AppointmentDao aptdao;
	
	@Override
	public AppointmentModel create(AppointmentModel Appointment) {
		// TODO Auto-generated method stub
		return aptdao.save(Appointment) ;
	}



	@Override
	public List<AppointmentModel> findAll() {
		// TODO Auto-generated method stub
		return (List<AppointmentModel>) aptdao.findAll();
	}



	@Override
	public void delete(Long id) {
		Optional<AppointmentModel> appt = aptdao.findById(id);
		if (appt !=null)
			aptdao.deleteById(id);
		
	}



	@Override
	public Optional<AppointmentModel> findById(Long id) {
		// TODO Auto-generated method stub
		return aptdao.findById(id);
	}





}
