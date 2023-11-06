package com.example.gestionuniversitaire.bll.service.impl;

import com.example.gestionuniversitaire.bll.models.exception.NotFoundException;
import com.example.gestionuniversitaire.bll.service.ProfessorService;
import com.example.gestionuniversitaire.dal.models.Professor;
import com.example.gestionuniversitaire.dal.repositories.ProfessorRepository;
import com.example.gestionuniversitaire.pl.models.ProfessorForm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorServiceImpl(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @Override
    public void createProfessor(ProfessorForm professorForm) {
        if(professorForm==null){
            throw new IllegalArgumentException("Form can't be null");
        }
        Professor professor = new Professor();
        professor.setFirstName(professorForm.getFirstName());
        professor.setLastName(professorForm.getLastName());
        professor.setBirthDate(professorForm.getBirthDate());
        professorRepository.save(professor);
    }

    @Override
    public Optional<Professor> getOneProfessor(Long id) {
        return professorRepository.findById(id);
    }

    @Override
    public List<Professor> getAllProfessors(Long id) {
        return professorRepository.findAll();
    }

    @Override
    public void updateProfessor(Long id, ProfessorForm professorForm) {
        if(professorForm==null){
            throw new IllegalArgumentException("Form can't be null");
        }

        Professor professor = professorRepository.findById(id).orElseThrow(()->new NotFoundException("Professor not found"));
        professor.setFirstName(professorForm.getFirstName());
        professor.setLastName(professorForm.getLastName());
        professor.setBirthDate(professorForm.getBirthDate());
        professorRepository.save(professor);

    }

    @Override
    public void deleteProfessor(Long id) {
        professorRepository.deleteById(id);
    }
}
