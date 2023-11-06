package com.example.gestionuniversitaire.dal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    public Long id;
    @Column(nullable = false)
    public String firstName;
    @Column(nullable = false)
    public String lastName;
    @Column(nullable = false)
    public LocalDate birthDate;
    @Column(nullable = false)
    public String login;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;



}
