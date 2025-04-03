package org.example.controller;

import org.example.model.Group;
import org.example.model.Human;
import org.example.model.Student;

public class GroupController {
    public static Group createGroup(String name, Human main) {
        return new Group(name, main);
    }

    public static void addStudentToGroup(Group group, Student student) {
        group.addStudent(student);
    }
}
