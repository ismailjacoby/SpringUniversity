package com.example.gestionuniversitaire.dal.repositories;

import com.example.gestionuniversitaire.dal.models.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section,Long> {
}
