package com.chaminda.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import com.chaminda.model.Student;

public class StudentBuilderTest{
	@Test
	public void shouldCreateStudentSucessfully(){
		// Given
		StudentBuilder builder = new StudentBuilder();
		// When
		Student student = builder.withId(1).withFirstName("Chaminda").withLastName("Ari")
		.withEmail("chaminda@yahoo.com").withDateOfBirth(new Date()).withNotes("Note").build();
		// Then
		assertNotNull(student);
		assertEquals(new Integer(1), student.getId());
		assertEquals("Chaminda", student.getFirstName());
		assertEquals("Ari", student.getLastName());
		assertEquals("chaminda@yahoo.com", student.getEmail());
		assertTrue(student.getDateOfBirth() instanceof Date);;
		assertEquals("Note", student.getNotes());
		
	}

}
