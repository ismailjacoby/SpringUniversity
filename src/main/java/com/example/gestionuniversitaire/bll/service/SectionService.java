package com.example.gestionuniversitaire.bll.service;

import com.example.gestionuniversitaire.dal.models.Course;
import com.example.gestionuniversitaire.dal.models.Section;
import com.example.gestionuniversitaire.dal.repositories.SectionRepository;
import com.example.gestionuniversitaire.pl.models.SectionForm;

import java.util.List;
import java.util.Optional;

public interface SectionService {
    void createSection(SectionForm sectionForm);
    Optional<Section> getOneSection(Long id);
    List<Section> getAllSections();
    void updateSection(Long id,SectionForm sectionForm);
    void deleteSection(Long id);

}
