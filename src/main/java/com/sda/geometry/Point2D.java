package com.sda.geometry;

public class Point2D {
    double x;
    double y;

    Point2D() { // brak operatora - domyślnie jak private
        System.out.println("Empty Point2D constructor.");
        x = 0;
        y = 0;
    }

    public Point2D(double x, double y) {
        System.out.println("Parametric Point2D constructor.");
        String message = String.format("Constructing Point2D at [%f, %f]", x, y);
        System.out.println(message);
        this.x = x;
        this.y = y;
    }

}
