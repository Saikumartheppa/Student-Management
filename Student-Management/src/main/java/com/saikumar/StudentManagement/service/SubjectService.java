package com.saikumar.StudentManagement.service;

import com.saikumar.StudentManagement.model.Subject;
import com.saikumar.StudentManagement.repository.ISubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
    @Autowired
    ISubjectRepo iSubjectRepo;

    public void createSubject(Subject subject) {
        iSubjectRepo.save(subject);
    }
}
