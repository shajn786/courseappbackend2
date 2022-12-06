package com.example.course_backend_app.dao;

import com.example.course_backend_app.model.Courses;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Courses, Integer> {


}
