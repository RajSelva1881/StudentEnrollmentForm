package com.example.student.enrollment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.enrollment.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{


}
