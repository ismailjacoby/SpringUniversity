package com.example.gestionuniversitaire.dal;

import com.example.gestionuniversitaire.bll.service.CourseService;
import com.example.gestionuniversitaire.bll.service.ProfessorService;
import com.example.gestionuniversitaire.bll.service.SectionService;
import com.example.gestionuniversitaire.bll.service.StudentService;
import com.example.gestionuniversitaire.pl.models.CourseForm;
import com.example.gestionuniversitaire.pl.models.ProfessorForm;
import com.example.gestionuniversitaire.pl.models.SectionForm;
import com.example.gestionuniversitaire.pl.models.StudentForm;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DataInit implements InitializingBean {
    private final StudentService studentService;
    private final ProfessorService professorService;
    private final CourseService courseService;
    private final SectionService sectionService;


    public DataInit(StudentService studentService, ProfessorService professorService, CourseService courseService, SectionService sectionService) {
        this.studentService = studentService;
        this.professorService = professorService;
        this.courseService = courseService;
        this.sectionService = sectionService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        initializeStudents();
        initializeProfessor();
        initializeCourses();
        initializeSections();
    }

    private void initializeStudents() {
        List<String> studentNames = Arrays.asList(
                "Elise Dirheimer",
                "Laurent Valenne",
                "Lucas Balon",
                "Gaetan Beukens",
                "Ismail Jacoby",
                "Geoffrey Beyer De Ryke",
                "Samuel Depierreux",
                "Pascal Decok",
                "Nathan Geisbuch",
                "Aline Daems"
        );

        LocalDate birthday = LocalDate.of(2023, 11, 6);

        for (String name : studentNames) {
            String[] nameParts = name.split(" ");
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            String login = generateLogin(firstName, lastName);

            StudentForm studentForm = new StudentForm();
            studentForm.setFirstName(firstName);
            studentForm.setLastName(lastName);
            studentForm.setBirthDate(birthday);
            studentForm.setLogin(login);

            studentService.createStudent(studentForm);
        }
    }
    private void initializeProfessor() {
        String professorName = "Yann Lorthoir";
        LocalDate birthday = LocalDate.of(2023, 11, 6);

        String[] nameParts = professorName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];
        String login = generateLogin(firstName, lastName);

        ProfessorForm professorForm = new ProfessorForm();
        professorForm.setFirstName(firstName);
        professorForm.setLastName(lastName);
        professorForm.setBirthDate(birthday);

        professorService.createProfessor(professorForm);
    }
    private void initializeCourses() {
        List<String> courseNames = Arrays.asList(
                "Java",
                "Spring",
                "HTML",
                "CSS",
                "JavaScript"
        );

        for (String name : courseNames) {
            CourseForm courseForm = new CourseForm();
            courseForm.setName(name);

            courseService.createCourse(courseForm);
        }
    }

    private void initializeSections() {
        List<String> sectionNames = Arrays.asList("Computer Science", "Softskills");

        for (String name : sectionNames) {
            SectionForm sectionForm = new SectionForm();
            sectionForm.setName(name);

            sectionService.createSection(sectionForm);
        }
    }
    private String generateLogin(String firstName, String lastName) {
        String firstThreeFirstName = firstName.substring(0, Math.min(firstName.length(), 2));
        String firstThreeLastName = lastName.substring(0, Math.min(lastName.length(), 3));
        return firstThreeLastName + firstThreeFirstName;
    }
}