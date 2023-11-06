package com.example.gestionuniversitaire.pl.models;

import com.example.gestionuniversitaire.dal.models.Course;
import com.example.gestionuniversitaire.dal.models.Professor;
import com.example.gestionuniversitaire.dal.models.Student;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SectionForm {

    public String name;
}
