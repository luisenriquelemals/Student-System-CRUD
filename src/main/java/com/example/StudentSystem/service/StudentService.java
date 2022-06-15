package com.example.StudentSystem.service;

import com.example.StudentSystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    Student getStudentById(Long id);

    void deleteStudentById(Long id);
}
