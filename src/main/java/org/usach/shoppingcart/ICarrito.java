package org.usach.shoppingcart;

public interface ICarrito {

    // Comportamiento del TDA Carrito

    void add(Producto p);

    void remove(int index);

    boolean find(int id);

    int getTotal();

}