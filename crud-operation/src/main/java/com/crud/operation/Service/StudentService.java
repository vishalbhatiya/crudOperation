package com.crud.operation.Service;

import com.crud.operation.Entity.Student;

import java.util.List;

public interface StudentService {
   public Student saveStudent(Student student);

 public List<Student> findAll();


     public Student findById(Long studentId);


   public void deleteStudentById(Long studentId);

public     Student updateStudent(Long studentId, Student student);
}
