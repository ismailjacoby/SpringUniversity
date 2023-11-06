package com.example.gestionuniversitaire.bll.service.impl;

import com.example.gestionuniversitaire.bll.models.exception.NotFoundException;
import com.example.gestionuniversitaire.bll.service.CourseService;
import com.example.gestionuniversitaire.dal.models.Course;
import com.example.gestionuniversitaire.dal.repositories.CourseRepository;
import com.example.gestionuniversitaire.pl.models.CourseForm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    public final CourseRepository courseRepository;


    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void createCourse(CourseForm courseForm) {
        if (courseForm==null){
            throw new IllegalArgumentException("Form can't be null");
        }
        Course course = new Course();
        course.setName(courseForm.getName());
        courseRepository.save(course);
    }

    @Override
    public Optional<Course> getOneCourse(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void updateCourse(Long id, CourseForm courseForm) {
        if (courseForm==null){
            throw new IllegalArgumentException("Form can't be null");
        }
        Course course = courseRepository.findById(id).orElseThrow(()->new NotFoundException("Course not found"));
        course.setName(courseForm.getName());
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
