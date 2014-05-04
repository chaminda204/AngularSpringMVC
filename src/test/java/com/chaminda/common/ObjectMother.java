package com.chaminda.common;

import java.util.Date;

import com.chaminda.builder.StudentBuilder;
import com.chaminda.model.Student;

public class ObjectMother {

	public static Student getPersistedStudent() {
		return new StudentBuilder().withId(1).withFirstName("Chaminda").withLastName("Ari")
				.withEmail("chaminda@yahoo.com").withDateOfBirth(new Date()).withNotes("Note").build();
	}
	
	public static Student getStudentBeforePersist() {
		return new StudentBuilder().withFirstName("Chaminda").withLastName("Ari")
				.withEmail("chaminda@yahoo.com").withDateOfBirth(new Date()).withNotes("Note").build();
	}
	
	public static Student getUpdatedStudent() {
		return new StudentBuilder().withFirstName("Ranga").withLastName("Ari")
				.withEmail("ranga@yahoo.com").withDateOfBirth(new Date()).withNotes("Note").build();
	}
	
	
}
