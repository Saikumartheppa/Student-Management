package com.saikumar.StudentManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    @Enumerated(EnumType.STRING)
    private Gender studentGender;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_Id")
    private Address address;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_subject_Id")
    private Subject subject;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "fk_studentId_CourseId_table",joinColumns = @JoinColumn(name = "fk_student_Id"),inverseJoinColumns = @JoinColumn(name = "course_Id"))
    private List<Course> courses;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_Id")
    private List<Teacher> teachers;
}
