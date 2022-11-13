package org.usach.exampleinterface;

public class Dog implements Animal {

    private String name;

    private String favouriteDogFood;

    private int currentSpeed;

    public Dog(String name, String favouriteDogFood, int currentSpeed) {
        this.name = name;
        this.favouriteDogFood = favouriteDogFood;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void walk() {
        System.out.println("dog walking");
    }

    @Override
    public void walk(int number) {
        System.out.println("dog walking with speed: " + number);
    }

    @Override
    public int walk(int number, int number2) {
        return 0;
    }

    @Override
    public int run(int number, int number2, int number3) {
        return 0;
    }

    @Override
    public void run(String number, int number2) {
        System.out.println("dog walking with speed: " + number2);
    }

    @Override
    public void eat() {
        System.out.println("dog eating");
    }

}
