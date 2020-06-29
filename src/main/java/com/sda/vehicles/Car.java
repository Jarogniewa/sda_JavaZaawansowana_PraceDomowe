package com.sda.vehicles;

public class Car extends Vehicle{
    //pola
    int passengers;

    //konstruktory
    public Car() {
        System.out.println("Empty Car constructor");
    }





    @Override //@ oznacza adnotację
    public void run(double velocity) {
        System.out.println("Car running at speed " + velocity);

    }

    void addPassenger() {
        ++passengers;
        System.out.println("Passenger was added. Current number of passengers: " + passengers);
    }
    void removePassenger() {
        if (passengers < 1)
        {
            return;
        }
        --passengers;
        System.out.println("Passenger was removed. Current number of passengers: " + passengers);
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + passengers +
                '}';
    }
}
