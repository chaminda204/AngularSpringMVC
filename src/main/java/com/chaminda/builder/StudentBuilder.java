package com.chaminda.builder;

import java.util.Date;

import com.chaminda.model.Student;

public class StudentBuilder implements Builder<Student> {

	private Integer id;
	
	private String firstName;

	private String lastName;

	private String email;

	private Date dateOfBirth;

	private String notes;

	@Override
	public Student build() {
		Student student = new Student();
		student.setId(id);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setEmail(email);
		student.setDateOfBirth(dateOfBirth);
		student.setNotes(notes);
		return student;
	}

	public StudentBuilder withId(Integer id) {
		this.id = id;
		return this;
	}

	public StudentBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;

	}

	public StudentBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public StudentBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public StudentBuilder withDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public StudentBuilder withNotes(String notes) {
		this.notes = notes;
		return this;
	}

}
