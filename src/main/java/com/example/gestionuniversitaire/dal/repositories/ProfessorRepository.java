package com.example.gestionuniversitaire.dal.repositories;

import com.example.gestionuniversitaire.dal.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor,Long> {
}
