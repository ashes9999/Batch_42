package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.PatientDao;
import com.spring.model.DoctorModel;
import com.spring.model.PatientModel;
@Service
public class PatientServiceImpl implements PatientService{
@Autowired
private PatientDao pdao;
	@Override
	public PatientModel create(PatientModel patient) {
		// TODO Auto-generated method stub
		return pdao.save(patient);
	}

	@Override
	public void delete(String id) {
		Optional<PatientModel> patient = pdao.findById(id);
		if (patient !=null)
		pdao.deleteById(id);		
	}

	@Override
	public List<PatientModel> findAll() {
		// TODO Auto-generated method stub
		return (List<PatientModel>) pdao.findAll();
	}

	@Override
	public Optional<PatientModel> findById(String id) {
		
		return pdao.findById(id);
	}

	@Override
	public PatientModel update(PatientModel patient) {
		
		return pdao.save(patient);
	}

}
