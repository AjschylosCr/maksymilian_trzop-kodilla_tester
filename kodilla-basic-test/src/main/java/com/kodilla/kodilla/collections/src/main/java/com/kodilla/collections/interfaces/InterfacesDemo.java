package com.kodilla.kodilla.collections.src.main.java.com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Circle cirlce = new Circle(7);
        System.out.println(cirlce.getArea());
        System.out.println(cirlce.getPerimeter());
    }

    public static void showShapeDetails(Shape shape ) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
