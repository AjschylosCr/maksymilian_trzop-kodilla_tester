package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private int a;

    public Circle(int a) {
        this.a=a;
    }
    @Override
    public double numbers() {
        System.out.println(Math.PI * a * a);
        return Math.PI * a * a;

    }
}