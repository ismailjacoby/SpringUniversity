package com.example.gestionuniversitaire.bll.service;

import com.example.gestionuniversitaire.dal.models.Course;
import com.example.gestionuniversitaire.pl.models.CourseForm;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    void createCourse(CourseForm courseForm);
    Optional<Course> getOneCourse(Long id);
    List<Course> getAllCourses();
    void updateCourse(Long id, CourseForm courseForm);
    void deleteCourse(Long id);

}
