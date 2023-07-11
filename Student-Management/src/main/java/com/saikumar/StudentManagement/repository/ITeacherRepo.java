package com.saikumar.StudentManagement.repository;

import com.saikumar.StudentManagement.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepo extends JpaRepository<Teacher,Long> {

}
