package com.example.gestionuniversitaire.pl.controllers;

import com.example.gestionuniversitaire.bll.service.SectionService;
import com.example.gestionuniversitaire.dal.models.Section;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sections")
public class SectionController {
    private final SectionService sectionService;

    public SectionController(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    @GetMapping("/all")
    public String listAllSections(Model model) {
        List<Section> sections = sectionService.getAllSections();
        model.addAttribute("sections", sections);
        return "university/sections";
    }
}
