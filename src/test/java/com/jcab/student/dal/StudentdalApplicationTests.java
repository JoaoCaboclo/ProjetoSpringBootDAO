package com.jcab.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jcab.student.dal.entities.Student;
import com.jcab.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testeCreateStudent() {
	   
		Student student = new Student();
		student.setName("John");
		student.setCoursse("Java Web Services");
		student.setFee(30d);
		studentRepository.save(student);
	}
		
	@Test
	public void testFindStudentById() {
		Student student = studentRepository.findById(1L).orElse(new Student());;
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		Student student = studentRepository.findById(1L).orElse(new Student());
		student.setName("Joseph");
		student.setFee(500d);
		studentRepository.save((Student) student);
	}

	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(1L);
		studentRepository.delete(student);
	}
	

}
