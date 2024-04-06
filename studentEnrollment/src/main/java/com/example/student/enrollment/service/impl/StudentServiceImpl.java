package com.example.student.enrollment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.enrollment.entity.Student;
import com.example.student.enrollment.repo.StudentRepo;
import com.example.student.enrollment.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentrepo;

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentrepo.findById(id).get();
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}

	@Override
	public boolean deleteStudentById(int student) {
		// TODO Auto-generated method stub
		studentrepo.deleteById(student);
		return true;
	}
 

}
