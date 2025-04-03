package org.example;

import org.example.controller.*;
import org.example.model.*;

public class Run {
    public static void createTypycalUniversity() {
        Human rector = HumanController.createHuman("Oleg", "dns", "tps", State.MALE);
        University university = UniversityController.createUniversity("NTU DP", rector);

        Human mainOfFaculty = HumanController.createHuman("Bonya", "kms", "udja", State.FEMALE);
        Faculty faculty = FacultyController.createFaculty("IT", mainOfFaculty);

        Human mainOfDepartament1 = HumanController.createHuman("Bobik", "sud", "ka", State.MALE);
        Department department1 = DepartmentController.createDepartment("Departament", mainOfDepartament1);

        Human mainOfDepartament2 = HumanController.createHuman("Bobik", "sud", "ka", State.MALE);
        Department department2 = DepartmentController.createDepartment("Departament", mainOfDepartament2);

        Human mainOfGroup1 = HumanController.createHuman("chupick", "basa", "gonka", State.MALE);
        Group group1 = GroupController.createGroup("Group1", mainOfGroup1);

        Human mainOfGroup2 = HumanController.createHuman("chupick", "basa", "gonka", State.MALE);
        Group group2 = GroupController.createGroup("Group2", mainOfGroup2);

        Human mainOfGroup3 = HumanController.createHuman("chupick", "basa", "gonka", State.MALE);
        Group group3 = GroupController.createGroup("Group3", mainOfGroup3);

        Human mainOfGroup4 = HumanController.createHuman("chupick", "basa", "gonka", State.MALE);
        Group group4 = GroupController.createGroup("Group4", mainOfGroup4);

        Student student1 = StudentController.createStudent("Bob1", "f1", "a", State.MALE);
        Student student2 = StudentController.createStudent("Bob2", "f2", "a", State.MALE);
        Student student3 = StudentController.createStudent("Bob3", "f3", "a", State.MALE);
        Student student4 = StudentController.createStudent("Bob4", "f4", "a", State.MALE);
        Student student5 = StudentController.createStudent("Bob5", "f5", "a", State.MALE);
        Student student6 = StudentController.createStudent("Bob6", "f6", "a", State.MALE);
        Student student7 = StudentController.createStudent("Bob7", "f7", "a", State.MALE);
        Student student8 = StudentController.createStudent("Bob8", "f8", "a", State.MALE);

        GroupController.addStudentToGroup(group1, student1);
        GroupController.addStudentToGroup(group1, student2);

        GroupController.addStudentToGroup(group2, student3);
        GroupController.addStudentToGroup(group2, student4);

        GroupController.addStudentToGroup(group3, student5);
        GroupController.addStudentToGroup(group3, student6);

        GroupController.addStudentToGroup(group4, student7);
        GroupController.addStudentToGroup(group4, student8);

        DepartmentController.addGroupToDepartment(department1,group1);
        DepartmentController.addGroupToDepartment(department1,group2);

        DepartmentController.addGroupToDepartment(department2,group3);
        DepartmentController.addGroupToDepartment(department2,group4);

        FacultyController.addDepartmentToFaculty(faculty,department1);
        FacultyController.addDepartmentToFaculty(faculty,department2);

        UniversityController.addFaculty(university, faculty);
    }
}
