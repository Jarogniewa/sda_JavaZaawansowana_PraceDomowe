package com.sda.vehicles;
//przejrzeć film z 20.06.2020 i dokończyć
public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run(100);

        Car car = new Car();

        car.addPassenger();
        System.out.println(car);

        car.run(120);

        // Testy do zadania 6
        System.out.println("Testy zadania 6");
        Vehicle vehicle0 = new Vehicle();
        vehicle0.run(60);
        vehicle0 = new Car();
        vehicle0.run(40);
    }

//    Road<Car> carRoad = new Road<>();
//    carRoad.addVehicle();
//
//    Road<String> stringRoad = new Road<>();
//    stringRoad.addVehicle("NOT A VEHICLE AT ALL!!!");

}
