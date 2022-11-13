package org.usach;

import org.usach.exampleabstractclass.Bicycle;
import org.usach.exampleabstractclass.Car;
import org.usach.exampleabstractclass.Vehicule;
import org.usach.exampleinheritance.Point2D;
import org.usach.exampleinheritance.Point3D;
import org.usach.exampleinterface.Animal;
import org.usach.exampleinterface.Cat;
import org.usach.tda.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inheritance example");
        Point2D myPoint2D = new Point2D(1, 2);
        Point3D myPoint3D = new Point3D(1, 2, 3);
        System.out.println(myPoint2D);
        System.out.println(myPoint3D);
        // Use a method from the superclass
        myPoint3D.setX(100);
        System.out.println(myPoint3D);

        System.out.println("Interface example");
        // Polymorphism: cat can be an Animal or a Cat class
        Animal myFirstCat = new Cat("garfield", "lasagna", 0, 9);
        Cat mySecondCat = new Cat("El gato con botas", "something", 10, 99);
        myFirstCat.walk();
        mySecondCat.walk();

        System.out.println("Abstract Class example");
        // An Abtract Class can't be instanced because has abstract methods
        //Vehicule myVehicule = new Vehicule();  //This is going to fail!
        Vehicule myCar = new Car("deLorean", 100, 1000, 2);
        Vehicule myBicycle = new Bicycle("oxford", 10, 20, 2, 2);
        // But also a Car and Bicycle can be his own class, this is polymorphism
        Car batmanCar = new Car("batman car", 10, 200, 1);

        System.out.println(myCar.getModel());
        System.out.println(myBicycle.getModel());
        System.out.println(batmanCar);

        // Example: Products
        var firstProduct = new Product("ps5", 700, "videogames");
        var secondProduct = new Product("xbox360", 300, "videogames");
        var thirdProduct = new Product("xboxOne", 600, "videogames");
        var fourProduct = new Product("cup", 20, "utils");
        var fifthProduct = new Product("guitar", 100, "music");

        // List of products with default objects
        var products = new ArrayList<>(
                Arrays.asList(
                        firstProduct, secondProduct, thirdProduct, fourProduct
                ));

        // Add element to a list
        products.add(fifthProduct);

        // Print list of products
        products.forEach(System.out::println);

        // Stream API example
        // Map
        var productNames =
                products.stream()
                        .map(Product::getName)
                        .collect(Collectors.toList());

        System.out.println("List of only names (Map example): ");
        productNames.forEach(System.out::println);

        // Filter
        var productsPriceGreaterThan400 =
                products.stream()
                        .filter(product -> product.getPrice() > 400)
                        .collect(Collectors.toList());

        System.out.println("List of filtered products by price (Filter example): ");
        productsPriceGreaterThan400.forEach(System.out::println);

        // Foreach
        // Execute a method in all objects
        System.out.println("Execute a method in all objects");

        // Method with arguments
        products.forEach(product -> product.increasePrice(100));
        // Method without arguments
        System.out.println("Method without arguments");
        products.forEach(System.out::println);


    }
}