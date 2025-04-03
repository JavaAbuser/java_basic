package org.example.controller;

import org.example.model.*;

public class UniversityController {
    static Human rector;
    static University university;
    static Human main;
    static Faculty faculty;
    static Human mainOfDepartment;
    static Department department;
    static Human groupLeader;
    static Group group;

    public static University produceUniversity() {
        rector = new Human("1", "2", "3", State.MALE) {};
        university = new University("Kyiv National University", rector);

        main = new Human("4", "5", "6", State.FEMALE) {};
        faculty = new Faculty("Faculty of Computer Science", main);

        mainOfDepartment = new Human("7", "8", "9", State.MALE) {};
        department = new Department("Software Engineering", mainOfDepartment);

        groupLeader = new Human("10", "11", "12", State.MALE) {};
        group = new Group("121-21-1", groupLeader);

        group.addStudent(new Student("13", "14", "15", State.MALE));
        group.addStudent(new Student("16", "17", "18", State.FEMALE));
        group.addStudent(new Student("135", "17", "18", State.FEMALE));
        group.addStudent(new Student("16", "26", "18", State.FEMALE));
        group.addStudent(new Student("16", "17", "12", State.FEMALE));
        group.addStudent(new Student("16", "44", "18", State.FEMALE));
        group.addStudent(new Student("16", "17", "879", State.FEMALE));
        group.addStudent(new Student("23", "17", "18", State.FEMALE));
        group.addStudent(new Student("99", "1", "3", State.FEMALE));

        department.addGroup(group);
        faculty.addDepartment(department);
        university.addFaculty(faculty);

        return getUniversity();
    }

    public static Human getRector() {
        return rector;
    }

    public static University getUniversity() {
        return university;
    }

    public static Human getMain() {
        return main;
    }

    public static Faculty getFaculty() {
        return faculty;
    }

    public static Human getMainOfDepartment() {
        return mainOfDepartment;
    }

    public static Department getDepartment() {
        return department;
    }

    public static Human getGroupLeader() {
        return groupLeader;
    }

    public static Group getGroup() {
        return group;
    }
}
