package org.usach.shoppingcart;

public class ProductoVestuario extends Producto {

    private Talla talla;

    public ProductoVestuario(String nombre, int precio, Talla talla) {
        super(nombre, precio);
        this.talla = talla;

    }
}
