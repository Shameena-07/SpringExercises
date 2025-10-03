package com.sample.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.student.entity.StudentEntity;
import com.sample.student.repository.StudentRepository;

@Service
public class StudentService {

	
	@Autowired
	private StudentRepository studentRepository;


	public StudentEntity registerStudent(StudentEntity newStudent) {
		
		return  studentRepository.save(newStudent);
	}

	
	public List<StudentEntity> getAllStudents() {
	
		return studentRepository.findAll();
	}

	public StudentEntity getOneStudent(Integer id) {
		
		return studentRepository.findById(id).get();
	}

}
