package com.chaminda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaminda.dao.StudentDao;
import com.chaminda.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public Student saveStudent(Student student) {
		Student savedStudent = studentDao.save(student);
		return savedStudent;
	}

	@Override
	public Student findStudentByID(Integer studentID) {
		Student student = studentDao.findOne(studentID);
		return student;
	}

}
