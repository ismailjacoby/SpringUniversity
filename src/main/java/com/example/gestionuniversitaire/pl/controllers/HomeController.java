package com.example.gestionuniversitaire.pl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String homePage() {
        return "university/home";
    }
}
