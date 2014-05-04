package com.chaminda.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student extends AbstractEntity implements Identifiable<Integer> {

	private static final long serialVersionUID = 1L;

	@Column(name = "student_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private Date dateOfBirth;
	
	private String notes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer studentId) {
		this.id = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String studentName) {
		this.firstName = studentName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
