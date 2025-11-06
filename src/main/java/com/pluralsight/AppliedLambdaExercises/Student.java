package com.pluralsight.AppliedLambdaExercises;

import java.util.List;

public class Student {
    private String name;
    private List<String> courses;

    public Student(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() { return name; }
    public List<String> getCourses() { return courses; }

    @Override
    public String toString() {
        return name + " (" + courses.size() + " courses)";
    }
}