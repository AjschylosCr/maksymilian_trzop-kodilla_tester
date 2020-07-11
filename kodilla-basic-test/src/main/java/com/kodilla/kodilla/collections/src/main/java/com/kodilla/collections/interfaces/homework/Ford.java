package com.kodilla.kodilla.collections.src.main.java.com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford (int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {return speed; }

    @Override
    public void increaseSpeed() {
        System.out.println(speed + 25); }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed - 25); }
}