package org.example.model;

public abstract class Human {
    private String firstName;
    private String lastName;
    private String middleName;

    private State state;

    public Human(String firstName, String lastName, String middleName, State state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.state = state;
    }

    public Human() {

    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", state=" + state +
                '}';
    }
}
