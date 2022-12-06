package com.example.course_backend_app.controller;

import com.example.course_backend_app.dao.CourseDao;
import com.example.course_backend_app.model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
    public  String AddCouse(@RequestBody Courses c)
    {

        System.out.println(c.getTitle());
        System.out.println(c.getDate());
        System.out.println(c.getDescription());
        System.out.println(c.getVenue());
        System.out.println(c.getDuration());
        dao.save(c);
        return "added";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Courses> ViewallCourse()
    {
        return (List<Courses>)dao.findAll();
    }
}
