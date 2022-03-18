package com.company;

public class Robot {
    int x, y;

    public void moveRight(int steps) {
        x += steps;
        System.out.println("Stepped " +steps +" to move right");
    }

    public void moveUp(int steps) {
        y += steps;
        System.out.println("Stepped " +steps +" to move up");
    }

    public void moveLeft(int steps) {
        x -= steps;
        if (x < 0) {
            x = 0;
            System.out.println("Stepped " +steps +" to move left");
        } else {
            System.out.println("Stepped " +steps +" but can not move right");
        }
    }

    public void moveDown(int steps) {
        y -= steps;
        if (y < 0) {
            y = 0;
            System.out.println("Stepped " +steps +" to move down");
        } else {
            System.out.println("Stepped " +steps +" but can not to move down");
        }
    }
}
