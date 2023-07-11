package com.saikumar.StudentManagement.service;

import com.saikumar.StudentManagement.model.Course;
import com.saikumar.StudentManagement.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;

    public void createCourse(Course course) {
        iCourseRepo.save(course);
    }
}
