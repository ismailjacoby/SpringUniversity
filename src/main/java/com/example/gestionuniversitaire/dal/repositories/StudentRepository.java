package com.example.gestionuniversitaire.dal.repositories;

import com.example.gestionuniversitaire.dal.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
