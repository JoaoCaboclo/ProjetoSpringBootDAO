package com.jcab.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.jcab.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
