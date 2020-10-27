package com.lts.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.lts.exception.StudentNotFoundException;
import com.lts.model.Student;


	@Repository
	public interface StudentRepository extends MongoRepository<Student, Integer> {
		List<Student> getAllStudents();
		List<Student> findByAddressCity(String city);
		List<Student> findByDepartment(String department);
		Student findStudentById(Integer studentId);
		List<Student> addStudent( Student student);

	}


