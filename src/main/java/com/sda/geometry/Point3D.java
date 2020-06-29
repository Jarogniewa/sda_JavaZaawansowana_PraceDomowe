package com.sda.geometry;

public class Point3D extends Point2D {
    double z;

    Point3D(){
        //Najlepiej jest dac Javie znac, ze chcemy moc sie odwolywac do pustego konstruktora
        //superklasy i dlatego warto dodac odwolanie "super()"
        super();
        System.out.println("Empty Point3D constructor");
        z = 0;
    }

    public Point3D(double x, double y, double z) {
        // Wywolanie konstruktora Point2D slowkiem "super"
        super(x, y);
        System.out.println("Parametric Point3D constructor");
        this.z = z;
    }
}
