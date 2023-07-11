package com.saikumar.StudentManagement.repository;

import com.saikumar.StudentManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,Long> {

    Student findStudentByStudentId(Long sId);
}
