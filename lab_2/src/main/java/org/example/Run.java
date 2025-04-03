package org.example;

import org.example.controller.*;
import org.example.model.*;

public class Run {
    public static void createTypycalUniversity() {
        Human rector = HumanController.createHuman("Oleg", "dns", "tps", State.MALE);
        University university = UniversityController.createUniversity("NTU DP", rector);

        Human mainOfFaculty = HumanController.createHuman("Bonya", "kms", "udja", State.FEMALE);
        Faculty faculty = FacultyController.createFaculty("IT", mainOfFaculty);

        Human mainOfDepartament = HumanController.createHuman("Bobik", "sud", "ka", State.MALE);
        Department department = DepartmentController.createDepartment("Departament", mainOfDepartament);

        Human mainOfGroup = HumanController.createHuman("chupick", "basa", "gonka", State.MALE);
        Group group = GroupController.createGroup("Group", mainOfGroup);

        Student student1 = StudentController.createStudent("Bob", "f", "a", State.MALE);
        Student student2 = StudentController.createStudent("Bob", "f", "a", State.MALE);
        Student student3 = StudentController.createStudent("Bob", "f", "a", State.MALE);

        GroupController.addStudentToGroup(group, student1);
        GroupController.addStudentToGroup(group, student2);
        GroupController.addStudentToGroup(group, student3);

        DepartmentController.addGroupToDepartment(department,group);
        FacultyController.addDepartmentToFaculty(faculty,department);
        UniversityController.addFaculty(university, faculty);
    }
}
