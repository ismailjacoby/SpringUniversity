package com.example.gestionuniversitaire.bll.service.impl;

import com.example.gestionuniversitaire.bll.service.CourseService;
import com.example.gestionuniversitaire.dal.repositories.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    public final CourseRepository courseRepository;


    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
}
