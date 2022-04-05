package com.greatlearning.springbootstudentapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.springbootstudentapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByFirstNameContainsAndLastNameContainsAllIgnoreCase(String firstName,String lastName);	
}
