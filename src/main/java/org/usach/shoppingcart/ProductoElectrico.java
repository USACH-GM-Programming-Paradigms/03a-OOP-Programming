package org.usach.shoppingcart;

public class ProductoElectrico extends Producto {

    private int garantia;

    public ProductoElectrico(String nombre, int precio, int garantia) {
        super(nombre, precio);
        this.setGarantia(garantia);

    }

    public void setGarantia(int garantia) {
        if (garantia >= 0)
            this.garantia = garantia;
    }
}
