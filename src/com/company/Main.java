package com.company;

public class Main {

    public static void main(String[] args) {
//        Human.averageWorking(); // "An average human works 40 hours per week."
//
//        Human peter =  new Human();
//        peter.setName("Peter");;
//        peter.work(); // "Peter loves working!"
//
//
//        Human alice =  new Human();
//        alice.name = "Alice";
//        alice.work(); // "Alice loves working!"

//        Complex number = new Complex();
//        number.real = 10;
//        number.image = 4;
//
//        Complex anotherNumber = new Complex();
//        anotherNumber.real = 6;
//        anotherNumber.image = 6;
//
//        number.add(anotherNumber);
//        number.subtract(anotherNumber);

//        Robot ben = new Robot();
//        ben.moveRight(3);
//        ben.moveUp(2);
//        ben.moveLeft(4);
//        ben.moveDown(2);
//        ben.moveRight(1);

//        Box box = new Box();
//        box.width = 2;
//        box.length = 3;
//        box.height = 4;
//        box.getVolume();

//        Counter counter = new Counter();
//        counter.current = 5;

//        Clock clock = new Clock();
//        clock.minutes = 0;
//        clock.next();
//        Patient patient = new Patient();
//        System.out.println(patient);
//        SomeClass instance = new SomeClass();
        Robot1 robot1 = new Robot1();
        Robot1 robot2 = new Robot1("UR","Human");
        Robot1 robot3 = new Robot1("Man","Genre",15);
        System.out.println(robot1);
        System.out.println(robot2);
        System.out.println(robot3);


    }
}
