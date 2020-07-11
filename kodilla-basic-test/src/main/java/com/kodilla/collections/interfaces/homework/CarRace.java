package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Pontiac;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford (130);
        System.out.println(Ford.getSpeed());
        System.out.println(Ford.increaseSpeed());
        System.out.println(Ford.decreaseSpeed());

        Honda honda = new Honda (110);
        System.out.println(Honda.getSpeed());
        System.out.println(Honda.increaseSpeed());
        System.out.println(Honda.decreaseSpeed());

        Pontiac pontiac = new Pontiac (120);
        System.out.println(Pontiac.getSpeed());
        System.out.println(Pontiac.increaseSpeed());
        System.out.println(Pontiac.decreaseSpeed());
    }
    public static void doRace(Car car ) {
        System.out.println(car.getSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
    }
}