package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Human main;

    private List<Group> groups = new ArrayList<>();

    public Department(String name, Human head) {
        this.name = name;
        this.main = head;
    }

    public Department() {

    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return main;
    }

    public void setHead(Human head) {
        this.main = head;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head=" + main +
                ", groups=" + groups +
                '}';
    }
}
