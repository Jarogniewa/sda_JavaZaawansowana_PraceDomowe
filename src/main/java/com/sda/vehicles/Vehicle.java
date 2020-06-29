package com.sda.vehicles;

import com.sun.java.accessibility.util.EventID;

public class Vehicle {

    public Vehicle() {
        System.out.println("Empty vehicle constructor.");
    }

public void run(double velocity){
    System.out.println("Vehicle running at speed " + velocity);
}

    @Override
    public String toString() {
        return "Vehicle{}";
    }
    void Vehicle() {
        System.out.println("Empty Vehicle constructor");
    }
}
