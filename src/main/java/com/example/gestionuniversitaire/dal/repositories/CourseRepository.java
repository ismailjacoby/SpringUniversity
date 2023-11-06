package com.example.gestionuniversitaire.dal.repositories;

import com.example.gestionuniversitaire.dal.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
