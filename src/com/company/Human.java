package com.company;

public class Human {
    private String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void averageWorking() {
        System.out.println("An average human works 40 hours per week.");
    }

    public void work() {
        System.out.println(this.name + " loves working!");
    }
}
