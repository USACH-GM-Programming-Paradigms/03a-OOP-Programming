package org.usach.exampleabstractclass;

public abstract class Vehicule {

    String model;

    int currentSpeed;

    int maxSpeed;

    public Vehicule(String model, int currentSpeed, int maxSpeed) {
        this.model = model;
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void accelerate();

    abstract void brake();

    abstract void start();

    abstract void stop();
}
