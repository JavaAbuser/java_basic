package org.example.controller;

import org.example.model.State;
import org.example.model.Student;

public class StudentController {
    public static Student createStudent(String firstName, String lastName, String middleName, State state) {
        return new Student(firstName, lastName, middleName, state);
    }
}
