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
import java.util.Comparator;
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

        // Get element by position in a list
        var productAtFirstPosition = products.get(0);
        System.out.println("Name of the first product: ");
        System.out.println(productAtFirstPosition.getName());

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

        // Min-Max
        // If you want min, change .max with .min
        Product productWithMaxPrice =
                products.stream()
                        .max(Comparator.comparing(Product::getPrice))
                        .get();

        System.out.println("Name of the product with the current max price");
        System.out.println(productWithMaxPrice.getName());
        System.out.println("Price of the product with the current max price");
        System.out.println(productWithMaxPrice.getPrice());

        // Sorting
        // Prices sorted from lowest to highest (by default)
        var sortedProductsByPriceLowestToHighest =
                products.stream()
                        .sorted(Comparator.comparing(Product::getPrice))
                        .collect(Collectors.toList());

        // Prices sorted from lowest to highest
        var sortedProductsByPriceHighestToLowest =
                products.stream()
                        .sorted(Comparator.comparing(Product::getPrice).reversed())
                        .collect(Collectors.toList());

        System.out.println("Sorted products by price from lowest to highest (by default)");
        sortedProductsByPriceLowestToHighest.forEach(System.out::println);
        System.out.println("Sorted products by price from highest to lowest (reversed)");
        sortedProductsByPriceHighestToLowest.forEach(System.out::println);

        //Sort by default object comparator (See Product Comparator method)
        var sortedProductsByDefaultComparator =
                products.stream()
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println("Sorted products by default comparator (name), check Product class comparator:");
        sortedProductsByDefaultComparator.forEach(System.out::println);

        // Count
        // Count filter elements
        // Add new element
        products.add(new Product("ps5", 800, "videogames"));

        var productPS5Ocurrences =
                products.stream()
                        .filter(product -> product.getName().equals("ps5"))
                        .count();

        System.out.println("Count product PS5 in products list:");
        System.out.println(productPS5Ocurrences);

        // Remove (distinct) duplicate elements
        var letters = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

        var distinctLetters =
                letters.stream()
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println("Distinct (no duplicates) letter list");
        distinctLetters.forEach(System.out::println);

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