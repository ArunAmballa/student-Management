package com.arun.temporary.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @PostMapping
    public String createEmployee(){
        return "Created New Employee";
    }

    @GetMapping
    public String getEmployee(){
        return "Getting Employee";
    }
}
