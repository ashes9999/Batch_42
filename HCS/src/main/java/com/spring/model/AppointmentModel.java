package com.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Appointments_Hcs")
public class AppointmentModel {
@Column(name="patientId")
private int patientId;
@Column(name="doctorName")
private String doctorName;
@Id
@Column(name="date_Time")
private Date date;
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public AppointmentModel(int patientId, String doctorName, Date date) {
	super();
	this.patientId = patientId;
	this.doctorName = doctorName;
	this.date = date;
}
public AppointmentModel() {
}



}
