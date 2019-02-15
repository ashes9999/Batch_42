package com.spring.model;

import java.util.Date;
import java.util.List;

public class AdminModel {
	private int Doctor_Id;
	private String Doctor_Name;
	private Date Appointments;
	private int Patient_Id;
	private String Patient_Email;
	private int Patient_Phone;
	private String Doctor_Email;
	private String Doctor_Address;
	private String Patient_Address;
	private String Patient_Name;
	private int Patient_Age;
	private int Doctor_Age;
	private float Amount;
	private float Pending;
	private List Patient_Symptoms;
	private String Disease;
	private String Treatment;
	private String Prescription;
	private String Specialization;

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public int getDoctor_Id() {
		return Doctor_Id;
	}

	public void setDoctor_Id(int doctor_Id) {
		Doctor_Id = doctor_Id;
	}

	public String getDoctor_Name() {
		return Doctor_Name;
	}

	public void setDoctor_Name(String doctor_Name) {
		Doctor_Name = doctor_Name;
	}

	public Date getAppointments() {
		return Appointments;
	}

	public void setAppointments(Date appointments) {
		Appointments = appointments;
	}

	public int getPatient_Id() {
		return Patient_Id;
	}

	public void setPatient_Id(int patient_Id) {
		Patient_Id = patient_Id;
	}

	public String getPatient_Name() {
		return Patient_Name;
	}

	public void setPatient_Name(String patient_Name) {
		Patient_Name = patient_Name;
	}

	public float getAmount() {
		return Amount;
	}

	public void setAmount(float amount) {
		Amount = amount;
	}

	public float getPending() {
		return Pending;
	}

	public void setPending(float pending) {
		Pending = pending;
	}

	public String getPrescription() {
		return Prescription;
	}

	public void setPrescription(String prescription) {
		Prescription = prescription;
	}

	public String getPatient_Email() {
		return Patient_Email;
	}

	public void setPatient_Email(String patient_Email) {
		Patient_Email = patient_Email;
	}

	public int getPatient_Phone() {
		return Patient_Phone;
	}

	public void setPatient_Phone(int patient_Phone) {
		Patient_Phone = patient_Phone;
	}

	public String getDoctor_Email() {
		return Doctor_Email;
	}

	public void setDoctor_Email(String doctor_Email) {
		Doctor_Email = doctor_Email;
	}

	public String getDoctor_Address() {
		return Doctor_Address;
	}

	public void setDoctor_Address(String doctor_Address) {
		Doctor_Address = doctor_Address;
	}

	public String getPatient_Address() {
		return Patient_Address;
	}

	public void setPatient_Address(String patient_Address) {
		Patient_Address = patient_Address;
	}

	public int getPatient_Age() {
		return Patient_Age;
	}

	public void setPatient_Age(int patient_Age) {
		Patient_Age = patient_Age;
	}

	public int getDoctor_Age() {
		return Doctor_Age;
	}

	public void setDoctor_Age(int doctor_Age) {
		Doctor_Age = doctor_Age;
	}

	public List getPatient_Symptoms() {
		return Patient_Symptoms;
	}

	public void setPatient_Symptoms(List patient_Symptoms) {
		Patient_Symptoms = patient_Symptoms;
	}

	public String getDisease() {
		return Disease;
	}

	public void setDisease(String disease) {
		Disease = disease;
	}

	public String getTreatment() {
		return Treatment;
	}

	public void setTreatment(String treatment) {
		Treatment = treatment;
	}

	@Override
	public String toString() {
		return "AdminModel [Doctor_Id=" + Doctor_Id + ", Doctor_Name=" + Doctor_Name + ", Appointments=" + Appointments
				+ ", Patient_Id=" + Patient_Id + ", Patient_Email=" + Patient_Email + ", Patient_Phone=" + Patient_Phone
				+ ", Doctor_Email=" + Doctor_Email + ", Doctor_Address=" + Doctor_Address + ", Patient_Address="
				+ Patient_Address + ", Patient_Name=" + Patient_Name + ", Patient_Age=" + Patient_Age + ", Doctor_Age="
				+ Doctor_Age + ", Amount=" + Amount + ", Pending=" + Pending + ", Patient_Symptoms=" + Patient_Symptoms
				+ ", Disease=" + Disease + ", Treatment=" + Treatment + ", Prescription=" + Prescription
				+ ", Specialization=" + Specialization + "]";
	}

}
