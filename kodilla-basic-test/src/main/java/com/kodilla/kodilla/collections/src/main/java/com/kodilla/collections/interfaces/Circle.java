package com.kodilla.kodilla.collections.src.main.java.com.kodilla.collections.interfaces;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

}
