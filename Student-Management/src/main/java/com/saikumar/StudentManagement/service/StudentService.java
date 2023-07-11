package com.saikumar.StudentManagement.service;

import com.saikumar.StudentManagement.model.Student;
import com.saikumar.StudentManagement.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;

    public void createStudent(Student student) {
        iStudentRepo.save(student);
    }

    public Iterable<Student> getAllStudents() {
        return iStudentRepo.findAll();
    }
    public Student getStudentById(Long sId){
       return iStudentRepo.findStudentByStudentId(sId);
    }
}
