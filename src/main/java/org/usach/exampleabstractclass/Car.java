package org.usach.exampleabstractclass;

public class Car extends Vehicule{

    int doorQty;

    public Car(String model, int currentSpeed, int maxSpeed, int doorQty) {
        super(model, currentSpeed, maxSpeed);
        this.doorQty = doorQty;
    }

    public int getDoorQty() {
        return doorQty;
    }

    public void setDoorQty(int doorQty) {
        this.doorQty = doorQty;
    }

    @Override
    void accelerate() {
        System.out.println("Car accelerate");
    }

    @Override
    void brake() {
        System.out.println("Car brake");
    }

    @Override
    void start() {
        System.out.println("Car start");
    }

    @Override
    void stop() {
        System.out.println("Car stop");
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorQty=" + doorQty +
                ", model='" + model + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
