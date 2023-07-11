package com.saikumar.StudentManagement.contoller;

import com.saikumar.StudentManagement.model.Subject;
import com.saikumar.StudentManagement.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
    @Autowired
    SubjectService subjectService;
    @PostMapping("subject")
    public void createSubject(@RequestBody Subject subject){
        subjectService.createSubject(subject);
    }
}
