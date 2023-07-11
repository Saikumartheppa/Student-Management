package com.saikumar.StudentManagement.contoller;

import com.saikumar.StudentManagement.model.Student;
import com.saikumar.StudentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("student")
    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }
    @GetMapping("students")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("students/student/{sId}")
    public Student getStudentById(@PathVariable Long sId){
    return studentService.getStudentById(sId);
   }
}