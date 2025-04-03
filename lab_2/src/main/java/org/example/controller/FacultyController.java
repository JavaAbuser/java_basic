package org.example.controller;

import org.example.model.Department;
import org.example.model.Faculty;
import org.example.model.Human;

public class FacultyController {
    public static Faculty createFaculty(String name, Human mainOfFaculty) {
        return new Faculty(name, mainOfFaculty);
    }

    public static void addDepartmentToFaculty(Faculty faculty, Department department) {
        faculty.addDepartment(department);
    }
}
