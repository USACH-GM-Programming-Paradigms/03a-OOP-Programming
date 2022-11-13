package org.usach;

import org.usach.tda.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

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


    }
}