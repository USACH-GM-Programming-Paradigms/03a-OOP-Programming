package org.usach.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Carrito implements ICarrito {

    // Carrito tiene una AGREGACIÓN de Productos
    // Carrito <>--- Producto
    // El diamante vacío va del lado de la clase que CONTIENE a la otra clase
    // Carrito contiene Producto
    // Agregación es una relación débil. Los ciclos de vida no están amarrados
    private List<Producto> productos = new ArrayList<>();
    private int total;

    @Override
    public void add(Producto p) {
        this.total += p.getPrecio();
        productos.add(p);
    }

    @Override
    public void remove(int index) {
        Producto p = this.productos.remove(index);
        this.total -= p.precio;
    }

    @Override
    public boolean find(int id) {
        for (Producto p : this.productos)
            if (p.getID() == id)
                return true;
        return false;
    }

    @Override
    public int getTotal() {
        return this.total;
    }

}
