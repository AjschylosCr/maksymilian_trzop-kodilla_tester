package com.kodilla.kodilla.collections.src.main.java.com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford (130);
        System.out.println(Ford.getSpeed());
        System.out.println(Ford.increaseSpeed());
        System.out.println(Ford.decreaseSpeed());

        Honda honda = new Honda (110);
        System.out.println(Ford.getSpeed());
        System.out.println(Ford.increaseSpeed());
        System.out.println(Ford.decreaseSpeed());

        Pontiac pontiac = new Pontiac (120);
        System.out.println(Ford.getSpeed());
        System.out.println(Ford.increaseSpeed());
        System.out.println(Ford.decreaseSpeed());
    }
    public static void doRace(Car car ) {
        System.out.println(car.getSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
    }
}
