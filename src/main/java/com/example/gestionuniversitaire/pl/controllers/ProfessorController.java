package com.example.gestionuniversitaire.pl.controllers;

import com.example.gestionuniversitaire.bll.service.ProfessorService;
import com.example.gestionuniversitaire.dal.models.Professor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/professors")
public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping("/all")
    public String listAllProfessors(Model model){
        List<Professor> professors=professorService.getAllProfessors();
        model.addAttribute("professors",professors);
        return "university/professors";
    }
}
