package com.kodilla.inheritance;

public class ApplicationCar {
    public static void main(String[] args) {
        Car car = new Car(4, 5);
        car.turnOnLights();

        Convertible convertible = new Convertible(4, 2);
        convertible.turnOnLights();
        System.out.println(convertible.getSeats());
    }
}