package org.usach.exampleabstractclass;

public class Bicycle extends Vehicule {

    int wheelsQty;

    int chainsQty;

    public Bicycle(String model, int currentSpeed, int maxSpeed, int wheelsQty, int chainsQty) {
        super(model, currentSpeed, maxSpeed);
        this.wheelsQty = wheelsQty;
        this.chainsQty = chainsQty;
    }

    public int getWheelsQty() {
        return wheelsQty;
    }

    public void setWheelsQty(int wheelsQty) {
        this.wheelsQty = wheelsQty;
    }

    public int getChainsQty() {
        return chainsQty;
    }

    public void setChainsQty(int chainsQty) {
        this.chainsQty = chainsQty;
    }

    @Override
    void accelerate() {
        System.out.println("Bicycle accelerate");
    }

    @Override
    void brake() {
        System.out.println("Bicycle brake");
    }

    @Override
    void start() {
        System.out.println("Bicycle start");
    }

    @Override
    void stop() {
        System.out.println("Bicycle stop");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "wheelsQty=" + wheelsQty +
                ", chainsQty=" + chainsQty +
                ", model='" + model + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
