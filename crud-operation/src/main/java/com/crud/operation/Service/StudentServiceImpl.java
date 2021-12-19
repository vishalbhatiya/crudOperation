package com.crud.operation.Service;


import com.crud.operation.Entity.Student;
import com.crud.operation.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl  implements StudentService     {

@Autowired
private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student)  {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public void deleteStudentById(Long studentId) {
studentRepository.deleteById(studentId);
    }


    @Override
    public Student updateStudent(Long studentId, Student student) {

        Student updateStudent=studentRepository.findById(studentId).get();

                updateStudent.setName(student.getName());
                updateStudent.setLastName(student.getLastName());
                updateStudent.setRollNo(student.getRollNo());

                studentRepository.save(updateStudent);
                return updateStudent;


    }
}
