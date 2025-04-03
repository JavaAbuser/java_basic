package org.example;

import org.example.Utility.JsonManager;
import org.example.controller.UniversityController;
import org.example.model.University;

public class Main {
    public static void main(String[] args) {
        Run.createTypycalUniversity();
        University university = UniversityController.getUniversity();

        JsonManager.saveUniversity(university);

        University university1 = JsonManager.readUniversity();
    }
}