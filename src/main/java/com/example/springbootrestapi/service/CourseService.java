package com.example.springbootrestapi.service;

import com.example.springbootrestapi.model.Course;

import java.util.Optional;

public interface CourseService {
    Course createCourse(Course course);
    Optional<Course> getCourseById(long courseId);
    Iterable<Course> getCoursesByCategory(String category);
    Iterable<Course> getCourses();
    void updateCourse(long courseId, Course course);
    void deleteCourseById(long courseId);
    void deleteCourses();

}
