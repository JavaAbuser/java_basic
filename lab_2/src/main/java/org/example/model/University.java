package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private Human rector;

    private final List<Faculty> faculties = new ArrayList<>();

    public University(String name, Human rector) {
        this.name = name;
        this.rector = rector;
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

    public Human getRector() {
        return rector;
    }

    public void SetHuman(Human rector) {
        this.rector = rector;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        return "University: " + name + ", Rector: " + rector.getFullName() + ", Faculties: " + faculties.size();
    }
}
