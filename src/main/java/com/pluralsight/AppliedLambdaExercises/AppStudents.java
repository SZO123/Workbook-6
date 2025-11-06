package com.pluralsight.AppliedLambdaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppStudents {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Hassan", Arrays.asList("Math","History","Physics","English")),
                new Student("Najib", Arrays.asList("Math","Physics")),
                new Student("Mikey", Arrays.asList("Math","History","Biology","Chemistry","Psychology"))
        );

        StudentFilter moreThan3Courses = s -> s.getCourses().size() > 3;
        List<Student> filtered = filterStudents(moreThan3Courses, students);
        System.out.println("Students with more than 3 courses: " + filtered);
    }

    public static List<Student> filterStudents(StudentFilter filter, List<Student> students) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (filter.filter(s)) {
                result.add(s);
            }
        }
        return result;
    }
}