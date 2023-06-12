package org.usach.tda;

import java.util.Date;

public class Product implements Comparable {

    private String name;

    private int price;

    private String category;

    private Date creationTimestamp;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.creationTimestamp = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void increasePrice(int amount) {
        this.price += amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", creationTimestamp='" + creationTimestamp + '\'' +
                '}';
    }

    // If you want to add  default comparator, you need to implement the Comparable interface
    // And override the default compareTo method
    @Override
    public int compareTo(Object o) {
        Product otherProduct = (Product) o;
        return this.getName().compareTo(otherProduct.getName());
    }

    // Internal methods
    // Override equals() and hashCode() methods to determine object uniqueness based on id
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MyObject myObject = (MyObject) o;
//        return Objects.equals(id, myObject.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
