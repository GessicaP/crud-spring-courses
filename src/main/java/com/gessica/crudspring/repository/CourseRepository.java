package com.gessica.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gessica.crudspring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{
    
}
