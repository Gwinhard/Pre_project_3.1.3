package com.example.pre_project_313.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

   @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
