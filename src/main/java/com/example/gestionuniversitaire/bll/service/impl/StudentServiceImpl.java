package com.example.gestionuniversitaire.bll.service.impl;

import com.example.gestionuniversitaire.bll.service.StudentService;
import com.example.gestionuniversitaire.dal.models.Student;
import com.example.gestionuniversitaire.dal.repositories.StudentRepository;
import com.example.gestionuniversitaire.pl.models.StudentForm;

import org.springframework.stereotype.Service;
import com.example.gestionuniversitaire.bll.models.exception.NotFoundException;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(StudentForm studentForm) {
        if(studentForm==null){
            throw new IllegalArgumentException("Form can't be null");
        }
        Student student = new Student();
        student.setFirstName(studentForm.getFirstName());
        student.setLastName(studentForm.getLastName());
        student.setBirthDate(studentForm.getBirthDate());
        student.setLogin(studentForm.getLogin());

        studentRepository.save(student);
    }

    @Override
    public Optional<Student> getOneStudent(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    @Override
    public void updateStudent(Long id, StudentForm studentForm) {
        if(studentForm==null){
            throw new IllegalArgumentException("Form can't be null");
        }

        Student student = studentRepository.findById(id).orElseThrow(()-> new NotFoundException("Student not Found"));
        student.setFirstName(studentForm.getFirstName());
        student.setLastName(studentForm.getLastName());
        student.setBirthDate(studentForm.getBirthDate());
        student.setLogin(studentForm.getLogin());
        studentRepository.save(student);

    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
