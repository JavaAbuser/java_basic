package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private Human main;

    private final List<Faculty> faculties = new ArrayList<>();

    public University(String name, Human main) {
        this.name = name;
        this.main = main;
    }

    public University() {

    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
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

    public void SetHuman(Human main) {
        this.main = main;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        return "University: " + name + ", Rector: " + main.getFullName() + ", Faculties: " + faculties.size();
    }
}
