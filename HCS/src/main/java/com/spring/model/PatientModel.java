package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Where;

@Entity
@Table(name="PatientHcs", uniqueConstraints = { 
        
            @UniqueConstraint(columnNames = {
                "patientId"
            }),@UniqueConstraint(columnNames = {
                    "username"
                })
    })
public class PatientModel {
	@Id 
	@Column(name="username",length=10)
	private String username;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PatientId")
	private Long patientId;
	
	
	
	@Column(name="PatientHeight",length=10)
	private String height;
	@Column(name="PatientWeight",length=20)
	private String weight;
	@Column(name="gender",length=10)
	private String gender;
	@Column(name="PatientCity",length=40)
	private String patientCity;
	@Column(name="PatientState",length=20)
	private String patientState;
	@Column(name="PatientProblem",length=60)
	private String patientProblem;
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(long id) {
		this.patientId = id;
	}
	

	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getPatientCity() {
		return patientCity;
	}
	public void setPatientCity(String patientCity) {
		this.patientCity = patientCity;
	}
	public String getPatientState() {
		return patientState;
	}
	public void setPatientState(String patientState) {
		this.patientState = patientState;
	}
	public String getPatientProblem() {
		return patientProblem;
	}
	public void setPatientProblem(String patientProblem) {
		this.patientProblem = patientProblem;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	
	
	
}
