package com.example.gestionuniversitaire.bll.service;

import com.example.gestionuniversitaire.dal.models.Professor;
import com.example.gestionuniversitaire.pl.models.ProfessorForm;

import java.util.List;
import java.util.Optional;

public interface ProfessorService {
    void createProfessor(ProfessorForm professorForm);
    Optional<Professor> getOneProfessor(Long id);
    List<Professor> getAllProfessors();
    void updateProfessor(Long id, ProfessorForm professorForm);
    void deleteProfessor(Long id);

}
