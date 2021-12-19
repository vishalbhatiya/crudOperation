package com.crud.operation.Controller;


import com.crud.operation.Entity.Student;
import com.crud.operation.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);


    }
    @GetMapping("/student")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/student/{id}")
    public Student findById(@PathVariable("id") Long studentId){
        return studentService.findById(studentId);

}
      @DeleteMapping("/student/{id}")
   public String deleteStudentById(@PathVariable("id") Long studentId ){
        studentService.deleteStudentById(studentId);

        return "successfully studentId is delete";
      }


            @PutMapping("/student/{id}")
      public Student updateStudent(@PathVariable("id")Long studentId,
                                   @RequestBody Student student){
        return studentService.updateStudent(studentId,student);
            }




}
