package com.example.course_backend_app.controller;

import com.example.course_backend_app.model.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {


    @PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
    public  String AddCouse(@RequestBody Courses c)
    {
        System.out.println(c.getTitle());
        System.out.println(c.getDate());
        System.out.println(c.getDescription());
        System.out.println(c.getVenue());
        System.out.println(c.getDuration());
        return "added";
    }

    @GetMapping("/viewall")
    public  String ViewakkCourse()
    {
        return "view all";
    }
}
