package com.spring.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
@Entity
@Table(name="Admin_H")
public class AdminModel {
@Column(name="firstname")
private String firstname;
private String lastname;
private String Email;
private String username;
private String password;
private String role;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public AdminModel(String firstname, String lastname, String email, String username,
		String password, String role) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.Email = email;
	this.username = username;
	this.password = password;
	this.role = role;
}
@Override
public String toString() {
	return "AdminModel [firstname=" + firstname + ", lastname=" + lastname + ", Email=" + Email + ", username="
			+ username + ", password=" + password + ", role=" + role + "]";
}
public AdminModel() {
}








}
