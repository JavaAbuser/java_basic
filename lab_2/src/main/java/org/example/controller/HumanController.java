package org.example.controller;

import org.example.model.Human;
import org.example.model.State;

public class HumanController {
    public static Human createHuman(String firstName, String lastName, String middleName, State state) {
        return new Human(firstName, lastName, middleName, state) {};
    }
}
