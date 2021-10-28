package com.example.pre_project_313.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminsController {

    @GetMapping("/admin")
    public String getAdminPage() {
        return "admin";
    }

}
