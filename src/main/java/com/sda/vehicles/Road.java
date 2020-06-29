package com.sda.vehicles;

import java.util.ArrayList;
import java.util.List;

//27.06.2020
public class Road <T extends Vehicle> { //Ograniczenie typu generycznego tylko do typu Vehicle
    T left;
    T right;
    List<T> vehicles = new ArrayList<>();

    void addVehicle (T vehicle) {
        vehicles.add(vehicle);
    }

    public void limitSpeed() {
        //TODO:
        //1. Sprawdź, czy pojazd jedzie więcej niż 40
        //2A. Jeśli tak, to zmniejsz do 40
        //2B. Jeśli nie, nie zmieniaj jego prędkości (jedzie wystarczająco wolno)

        for (int i =0; i < vehicles.size(); i++) {
            vehicles.get(i).run(40);
        }
    }

    @Override
    public String toString(){
        return "Road{" +
                "vehicles=" + vehicles +
                '}';


    }
}
