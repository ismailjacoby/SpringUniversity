package com.example.gestionuniversitaire.bll.service;

import com.example.gestionuniversitaire.dal.models.Student;
import com.example.gestionuniversitaire.pl.models.StudentForm;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface StudentService {
    void createStudent(StudentForm studentForm);
    Optional<Student> getOneStudent(Long id);
    List<Student> getAllStudents();
    void updateStudent(Long id, StudentForm studentForm);
    void deleteStudent(Long id);

}
