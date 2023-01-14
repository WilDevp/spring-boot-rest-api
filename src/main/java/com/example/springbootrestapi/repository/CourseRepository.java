package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository  extends CrudRepository<Course, Long> {
    Iterable<Course> findAllByCategory(String category);
}
