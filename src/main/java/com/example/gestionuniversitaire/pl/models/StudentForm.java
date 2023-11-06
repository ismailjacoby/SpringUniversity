package com.example.gestionuniversitaire.pl.models;

import com.example.gestionuniversitaire.dal.models.Section;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class StudentForm {

    public String firstName;

    public String lastName;

    public LocalDate birthDate;

    public String login;

}
