package com.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Appointments_Hcs")
public class AppointmentModel {
@Id
@Column(name="patientname", length=40)
private String patientname;
@Column(name="doctorName", length=40)
private String doctorname;

@Column(name="date", length=40)
private String date;
@Column(name="time", length=20)
private String time;



public String getPatientname() {
	return patientname;
}

public void setPatientname(String patientname) {
	this.patientname = patientname;
}

public String getDoctorname() {
	return doctorname;
}

public void setDoctorname(String doctorname) {
	this.doctorname = doctorname;
}



public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public AppointmentModel(String patientname, String doctorname, String date, String time) {
	super();
	this.patientname = patientname;
	this.doctorname = doctorname;
	this.date = date;
	this.time = time;
}

public AppointmentModel() {
	super();
	// TODO Auto-generated constructor stub
}


}
