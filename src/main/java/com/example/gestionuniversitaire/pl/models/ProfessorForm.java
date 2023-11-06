package com.example.gestionuniversitaire.pl.models;

import com.example.gestionuniversitaire.dal.models.Section;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ProfessorForm {
    public String firstName;
    public String lastName;
    public LocalDate birthDate;

}
