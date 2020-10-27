package com.lts.service;

import java.util.List;

import com.lts.exception.StudentNotFoundException;
import com.lts.model.Student;


public interface StudentService {
	
	
	Student addStudent(Student student);
	Student getStudentById(int studentId) throws StudentNotFoundException;
	boolean deleteStudent(int studentId) throws StudentNotFoundException;
	List<Student> getAllStudents();
	 
	List<Student> getStudentsByCity(String city) throws StudentNotFoundException;
	List<Student> getStudentsByDepartment(String department) throws StudentNotFoundException;
}