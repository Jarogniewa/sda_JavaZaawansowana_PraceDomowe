package com.sda.geometry;

public class Rectangle extends FlatShape {

    // Konstruktor biorący dane po rodzicach.
    Rectangle (double x, double y) {
        super(x, y);
    }

    // Implementacja metody z klasy abstarkcyjnej.
    @Override
    double getArea() {
        return x*y;
    }
}
