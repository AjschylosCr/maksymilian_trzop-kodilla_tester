package com.kodilla.abstracts.homework;

public class ApplicationFigury {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2);
        circle1.numbers();

        Rectangle rectangle1 = new Rectangle(2, 8);
        rectangle1.numbers();

        Triangle triangle1 = new Triangle(6, 4);
        triangle1.numbers();
    }
}