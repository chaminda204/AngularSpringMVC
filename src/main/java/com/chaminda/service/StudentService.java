package com.chaminda.service;

import com.chaminda.model.Student;

public interface StudentService {

	Student saveStudent(Student student);

	Student findStudentByID(Integer studentID);


}
