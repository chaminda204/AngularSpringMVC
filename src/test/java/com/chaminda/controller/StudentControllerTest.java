package com.chaminda.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.chaminda.common.ObjectMother;
import com.chaminda.model.Student;
import com.chaminda.service.StudentService;

public class StudentControllerTest {

	@InjectMocks
	private StudentController controller;

	@Mock
	private StudentService studentService;

	@Before
	public void beforeClass() {
		controller = new StudentController();
		initMocks(this);
	}

	@Test
	public void shouldSucessfullySaveStudent() {
		// Given
		Student student = ObjectMother.getStudentBeforePersist();
		given(studentService.saveStudent(student)).willReturn(ObjectMother.getPersistedStudent());

		// When
		Student savedStudent = studentService.saveStudent(student);

		// Then
		assertNotNull(savedStudent);
		assertEquals(new Integer(1), savedStudent.getId());
	}
	
	public void shouldSucessfullyRetrieveStudentById(){
		//Given
		Integer studentID = 1;
		given(studentService.findStudentByID(studentID)).willReturn(ObjectMother.getPersistedStudent());
		
		//When
		Student persisted = studentService.findStudentByID(studentID);
		
		//Then
		assertNotNull(persisted);
		assertEquals(studentID, persisted.getId());
	}

}
