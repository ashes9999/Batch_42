package com.spring.dao;

public interface AdminDao {
	public String saveDoctor();
	public String savePatient();
	public float viewPayment();
	public float createPayment();
	public float deletePayment();
	public float updatePayment();
	public String deleteDoctor();
	public String deletePatient();
	public String updateDoctor();
	public String updatePatient();
	public String deleteAppointment();
	public String createAppointment();
	public String updateAppointment();
	public String viewAppointment();
	public String viewPrescription();
	public String deleteDisease();
	public String createDisease();
	public String updateDisease();
	public String viewDisease();
	public String deleteSymptoms();
	public String createSymptoms();
	public String updateSymptoms();
	public String viewSymptoms();
}
