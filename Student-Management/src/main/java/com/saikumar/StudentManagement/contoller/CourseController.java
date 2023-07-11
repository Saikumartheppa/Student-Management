package com.saikumar.StudentManagement.contoller;

import com.saikumar.StudentManagement.model.Course;
import com.saikumar.StudentManagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping("course")
    public void createCourse(@RequestBody Course course){
        courseService.createCourse(course);
    }
}
