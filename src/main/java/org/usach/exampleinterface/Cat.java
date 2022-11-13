package org.usach.exampleinterface;

public class Cat implements Animal {

    private String name;

    private String favouriteCatFood;

    private int currentSpeed;

    private int numberLives;

    public Cat(String name, String favouriteCatFood, int currentSpeed, int numberLives) {
        this.name = name;
        this.favouriteCatFood = favouriteCatFood;
        this.currentSpeed = currentSpeed;
        this.numberLives = numberLives;
    }

    @Override
    public void walk() {
        System.out.println("cat walking");
    }

    @Override
    public void walk(int number) {
        System.out.println("cat walking with speed: " + number);
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
        System.out.println("cat walking with speed: " + number2);
    }

    @Override
    public void eat() {
        System.out.println("cat eating");
    }
}
