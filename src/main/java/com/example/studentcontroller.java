package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/details")
    public String getDetails() {
        return "Student Name: John Doe, Course: Computer Science";
    }
}
