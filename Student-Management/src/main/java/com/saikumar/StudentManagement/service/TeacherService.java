package com.saikumar.StudentManagement.service;

import com.saikumar.StudentManagement.model.Teacher;
import com.saikumar.StudentManagement.repository.ITeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    ITeacherRepo iTeacherRepo;

    public void createTeacher(Teacher teacher) {
        iTeacherRepo.save(teacher);
    }
}
