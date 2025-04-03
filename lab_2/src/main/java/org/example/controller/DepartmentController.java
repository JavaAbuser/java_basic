package org.example.controller;

import org.example.model.Department;
import org.example.model.Group;
import org.example.model.Human;

public class DepartmentController {
    public static Department createDepartment(String name, Human mainOfFaculty) {
        return new Department(name, mainOfFaculty);
    }

    public static void addGroupToDepartment(Department department, Group group) {
        department.addGroup(group);
    }
}
