package com.saikumar.StudentManagement.repository;

import com.saikumar.StudentManagement.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectRepo extends JpaRepository<Subject,Long> {

}
