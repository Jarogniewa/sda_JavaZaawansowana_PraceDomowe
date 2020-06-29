package com.sda.geometry;

public abstract class FlatShape {
    //pola
    protected double x;
    protected double y;

    //konstruktor
    FlatShape(double x, double y) {
        this.x=x;
        this.y=y;
    }

    //metody
   void printDimensions( ) {
       System.out.println(String.format("FlatShape [x, y] = [%f, %f]", x, y));
   }

   abstract double getArea();


}
