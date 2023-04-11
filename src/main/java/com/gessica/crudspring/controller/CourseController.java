package com.gessica.crudspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gessica.crudspring.model.Course;
import com.gessica.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@Component
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

   
    @GetMapping
    //@RequestMapping(method = RequestMethod.GET)
    public List<Course> list(){
        return courseRepository.findAll();
    }
}
