package com.company;

public class Patient {
    String name;
    int age;
    float height;

    public Patient() {
        this.name = "Unknown";
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
