package org.usach;

import org.usach.tda.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Example: Products
        var firstProduct = new Product("ps5", 700, "videogames");
        var secondProduct = new Product("xbox360", 300, "videogames");
        var thirdProduct = new Product("xboxOne", 600, "videogames");
        var fourProduct = new Product("cup", 20, "utils");

        // List of products
        var products = new ArrayList<>(
                Arrays.asList(
                        firstProduct, secondProduct, thirdProduct, fourProduct
                ));

        // Print list of products
        products.forEach(System.out::println);

    }
}