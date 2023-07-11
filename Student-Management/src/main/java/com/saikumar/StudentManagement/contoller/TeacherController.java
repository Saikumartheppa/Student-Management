package com.saikumar.StudentManagement.contoller;

import com.saikumar.StudentManagement.model.Teacher;
import com.saikumar.StudentManagement.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @PostMapping("teacher")
    public void createTeacher(@RequestBody Teacher teacher){
        teacherService.createTeacher(teacher);
    }
}
