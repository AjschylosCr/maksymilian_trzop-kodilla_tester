package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a=a;
        this.b=b;
    }
    @Override
    public double numbers() {
        System.out.println(a * b);
        return a*b;

    }
}