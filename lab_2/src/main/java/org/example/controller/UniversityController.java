package org.example.controller;

import org.example.model.*;

public class UniversityController {
    static University university;

    public static University createUniversity(String name, Human rector) {
        university = new University(name, rector);
        return university;
    }

    public static void addFaculty(University university, Faculty faculty) {
        university.addFaculty(faculty);
    }

    public static University getUniversity() {
        return university;
    }
}
