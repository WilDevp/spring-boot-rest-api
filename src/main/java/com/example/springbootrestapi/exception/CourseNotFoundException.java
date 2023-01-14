package com.example.springbootrestapi.exception;

public class CourseNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 5071646428281007896L;

    public CourseNotFoundException(String message) {
        super(message);
    }
}
