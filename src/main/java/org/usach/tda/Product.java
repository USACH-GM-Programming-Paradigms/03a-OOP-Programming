package org.usach.tda;

public class Product implements Comparable {

    private String name;

    private int price;

    private String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
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
                '}';
    }

    // If you want to add  default comparator, you need to implement the Comparable interface
    // And override the default compareTo method
    @Override
    public int compareTo(Object o) {
        Product otherProduct = (Product) o;
        return this.getName().compareTo(otherProduct.getName());
    }
}
