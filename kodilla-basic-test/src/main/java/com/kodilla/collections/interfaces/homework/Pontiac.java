package com.kodilla.collections.interfaces.homework;

public class Pontiac implements Car {
    private int speed;

    public Pontiac (int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed + 45); }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed - 44); }
}