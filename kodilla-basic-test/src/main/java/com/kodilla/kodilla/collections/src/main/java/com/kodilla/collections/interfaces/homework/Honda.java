package com.kodilla.kodilla.collections.src.main.java.com.kodilla.collections.interfaces.homework;

public class Honda implements Car {
    private int speed;

    public Honda (int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed + 35); }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed - 30); }
}