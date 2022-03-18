package com.company;

public class Robot1 {
    String name;
    String model;
    int lifetime;

    public Robot1() {
        this.name = "Anonymous";
        this.model = "Unknown";
    }

    public Robot1(String name, String model) {
        this(name, model, 20);
    }

    public Robot1(String name, String model, int lifetime) {
        this.name = name;
        this.model = model;
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "Robot1{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", lifetime=" + lifetime +
                '}';
    }
}

