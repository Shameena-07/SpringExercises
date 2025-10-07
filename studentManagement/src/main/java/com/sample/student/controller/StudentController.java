package com.sample.student.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sample.student.entity.StudentEntity;
import com.sample.student.service.StudentService;

@RestController
@RequestMapping("api/student")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/register")
	public ResponseEntity<StudentEntity> registerNewStudent(@RequestBody StudentEntity newStudent){
		var student = studentService.registerStudent(newStudent);
		return ResponseEntity.ok(student);
	}
	
	
	@GetMapping("/getAllStudents")
	public List<StudentEntity> getAllStudents(){
		var studentList = studentService.getAllStudents();
		return studentList;
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<StudentEntity> getById(@PathVariable("id")Integer id){
		var student = studentService.getOneStudent(id);
		return ResponseEntity.ok(student);
		
	}

}
