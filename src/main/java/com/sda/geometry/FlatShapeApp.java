package com.sda.geometry;

public class FlatShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());

        Triangle triangle = new Triangle(3, 5);
        System.out.println(triangle.getArea());
    }
}
