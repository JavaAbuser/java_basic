package org.example;

import org.example.controller.UniversityController;
import org.example.model.University;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        University university = UniversityController.produceUniversity();
        System.out.println("University: " + university);
    }
}