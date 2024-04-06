package com.example.student.enrollment.service;

import com.example.student.enrollment.entity.Student;

public interface StudentService {

	public Student getStudentById(int id);
	public Student createStudent(Student student);
	public Student updateStudent(Student student);
	public boolean deleteStudentById(int student);//entire payload
	
}
