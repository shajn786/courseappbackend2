package com.example.course_backend_app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {


    @PostMapping("/add")
    public  String AddCouse()
    {
        return "added";
    }
}
