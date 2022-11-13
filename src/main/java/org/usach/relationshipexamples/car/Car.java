package org.usach.relationshipexamples.car;

public class Car {

    String model;
    Engine engine;

    public Car(String model) {
        this.model = model;
        this.engine = new Engine(); // Strong lifecycle, tight coupled, is a COMPOSITION
    }
}
