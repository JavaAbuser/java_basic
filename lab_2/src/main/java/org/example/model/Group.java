package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Human main;

    private List<Student> students = new ArrayList<>();

    public Group(String name, Human head) {
        this.name = name;
        this.main = head;
    }

    public Group() {

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getMain() {
        return main;
    }

    public void setMain(Human main) {
        this.main = main;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", main=" + main +
                ", students=" + students +
                '}';
    }
}
