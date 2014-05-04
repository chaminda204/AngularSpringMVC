package com.chaminda.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.chaminda.common.ObjectMother;
import com.chaminda.dao.StudentDao;
import com.chaminda.model.Student;

public class StudentServiceTest {

	@InjectMocks
	private StudentService studentService;

	@Mock
	private StudentDao studentDao;

	@Before
	public void beforeClass() {
		studentService = new StudentServiceImpl();
		initMocks(this);
	}

	@Test
	public void shouldSucessfullySaveStudent() {
		// Given
		Student student = ObjectMother.getStudentBeforePersist();
		
		given(studentDao.save(student)).willReturn(ObjectMother.getPersistedStudent());

		// When
		Student savedStudent = studentService.saveStudent(student);

		// Then
		assertNotNull(savedStudent);
		assertEquals(new Integer(1), savedStudent.getId());
	}
	
	public void shouldSucessfullyRetrieveStudentById(){
		//Given
		Integer studentID = 1;
		given(studentDao.findOne(studentID)).willReturn(ObjectMother.getPersistedStudent());
		
		//When
		Student persisted = studentDao.findOne(studentID);
		
		//Then
		assertNotNull(persisted);
		assertEquals(studentID, persisted.getId());
	}
	
	public void shouldSucessfullyUpdateExistingRecord(){
		// Given
		Student student = ObjectMother.getPersistedStudent();
		given(studentDao.save(student)).willReturn(ObjectMother.getPersistedStudent());
		//When
		//Student updatedStudent = studentService.equals(obj)
		//Then
		
	}

	
}
