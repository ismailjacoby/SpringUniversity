package com.example.gestionuniversitaire.dal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Section {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "option_id")
    public Long id;

    @Column(nullable = false)
    public String name;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @OneToMany(mappedBy = "section")
    private List<Student> students;

}
