package com.company;

public class Person {
    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void eat() {
        System.out.println("* "+name + " wants to eat KFC");

    }

    public void walk() {
        System.out.println("* "+name + " loves to walk on the park");

    }

    public void learn() {
        System.out.println("* "+name + " is hard working, that's why " + name + " didn't stop learning");
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'';
    }
}
