package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;
    public void turnOn() {
        System.out.println("ON");
    }

    public void turnOff() {
        System.out.println("OFF");
    }

    public void System(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}