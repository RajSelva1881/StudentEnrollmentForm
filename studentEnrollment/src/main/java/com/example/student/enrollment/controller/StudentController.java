package com.example.student.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.example.student.enrollment.entity.Student;
import com.example.student.enrollment.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	// Controller >> Service ?? Repository --> DB (Table, Entity)
	
	@Autowired
	//http://localhost:8080/api/studet/123
	private StudentService studentservice;
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentservice.getStudentById(id);
	}
	
	@PostMapping("/create")
	public Student create(@RequestBody Student student) {
		return studentservice.createStudent(student);
	}
	
	@PostMapping("/update")
	public Student update(@RequestBody Student student) {
		return studentservice.updateStudent(student);
	}
	@PatchMapping("/patchupdate")
	public Student patch(@RequestBody Student student) {
		return studentservice.updateStudent(student);
	}
	
	@PutMapping("/putupdate")
	public Student putUpdate(@RequestBody Student student) {
		return studentservice.updateStudent(student);
	}
	
	
	@PatchMapping("/update")
	public Student modify(@RequestBody Student student) {
		return studentservice.updateStudent(student);
	}
	
	@DeleteMapping("/delete")
	public boolean delete(@RequestBody int studentId) {
		return studentservice.deleteStudentById(studentId);
	}
	
}

//SATT