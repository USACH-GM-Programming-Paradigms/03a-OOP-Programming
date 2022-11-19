package org.usach.shoppingcart;

import java.util.Date;

public class ProductoAlimenticio extends Producto {

    private Date expiracion;

    public ProductoAlimenticio(String nombre, int precio, Date expiracion) {
        super(nombre, precio);
        this.expiracion = expiracion;
    }

}
