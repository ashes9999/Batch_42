package com.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "DoctorHcs", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }),
		@UniqueConstraint(columnNames = { "DoctorId" }) })
public class DoctorModel {
	@Id
	@Column(name = "username", length = 20)
	private String username;
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "DoctorId", length = 10)
	private int doctorId;
	@Column(name = "doctorname", length = 40)
	private String doctorname;
	@Column(name = "doctorspecialization", length = 60)
	private String doctorspecialization;
	@Column(name = "doctorcity", length = 40)
	private String doctorcity;
	@Column(name = "doctorstate", length = 20)
	private String doctorstate;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getDoctorspecialization() {
		return doctorspecialization;
	}

	public void setDoctorspecialization(String doctorspecialization) {
		this.doctorspecialization = doctorspecialization;
	}

	public String getDoctorcity() {
		return doctorcity;
	}

	public void setDoctorcity(String doctorcity) {
		this.doctorcity = doctorcity;
	}

	public String getDoctorstate() {
		return doctorstate;
	}

	public void setDoctorstate(String doctorstate) {
		this.doctorstate = doctorstate;
	}

	public DoctorModel(String username, int doctorId, String doctorname, String doctorspecialization, String doctorcity,
			String doctorstate) {
		super();
		this.username = username;
		this.doctorId = doctorId;
		this.doctorname = doctorname;
		this.doctorspecialization = doctorspecialization;
		this.doctorcity = doctorcity;
		this.doctorstate = doctorstate;
	}

	public DoctorModel() {
		super();
	}

}