package com.example.gestionuniversitaire.bll.service.impl;

import com.example.gestionuniversitaire.bll.models.exception.NotFoundException;
import com.example.gestionuniversitaire.bll.service.SectionService;
import com.example.gestionuniversitaire.dal.models.Section;
import com.example.gestionuniversitaire.dal.repositories.SectionRepository;
import com.example.gestionuniversitaire.pl.models.SectionForm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SectionServiceImpl implements SectionService {
    private final SectionRepository sectionRepository;

    public SectionServiceImpl(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    @Override
    public void createSection(SectionForm sectionForm) {
        if(sectionForm==null){
            throw new IllegalArgumentException("Form can't be null");
        }
        Section section = new Section();
        section.setName(sectionForm.getName());

        sectionRepository.save(section);
    }

    @Override
    public Optional<Section> getOneSection(Long id) {
        return sectionRepository.findById(id);
    }

    @Override
    public List<Section> getAllSections() {
        return sectionRepository.findAll();
    }

    @Override
    public void updateSection(Long id, SectionForm sectionForm) {
        if(sectionForm==null){
            throw new IllegalArgumentException("Form can't be null");
        }
        Section section = sectionRepository.findById(id).orElseThrow(()-> new NotFoundException("Section not found"));
        section.setName(sectionForm.getName());
        sectionRepository.save(section);
    }

    @Override
    public void deleteSection(Long id) {
        sectionRepository.deleteById(id);
    }
}
