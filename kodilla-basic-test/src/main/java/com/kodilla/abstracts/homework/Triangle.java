package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private int a;
    private int b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double numbers() {
        System.out.println(a * b / 2);
        return a*b/2;
    }
}